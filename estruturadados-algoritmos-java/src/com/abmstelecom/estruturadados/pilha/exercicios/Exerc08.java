/*
Usando a classe Pilha ou Stack, desenvolva um algoritmo que
resolva o quebra cabeça Torre de Hanoi.
 */



package com.abmstelecom.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exerc08 {
    public static void main(String[] args) {

        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);

        System.out.println("---------------");
        System.out.println("Original: " + original);
        System.out.println("Destino:  " + destino);
        System.out.println("Auxiliar: " + auxiliar);
        torreHanoi(original.size(), original, destino, auxiliar);

    }

    public static void torreHanoi(int n, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar){
        if(n > 0){
            torreHanoi(n-1, original, auxiliar, destino);
            destino.push(original.pop());
            System.out.println("---------------");
            System.out.println("Original: " + original);
            System.out.println("Destino:  " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreHanoi(n-1, auxiliar, destino, original);

        }
    }


}

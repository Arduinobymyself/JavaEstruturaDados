/*
PALÍNDROMO
Escreva um programa que testa se uma sequência de caracteres fornecida
pelo usuário é um palíndromo, ou seja, é uma palavra cuja
primeira metade é simétrica à segunda metade.
Veja alguns exemplos:
- AABCCBAA = sim
- ADDFDDA = sim
- ABFFBB = não
 */

package com.abmstelecom.estruturadados.pilha.exercicios;

import com.abmstelecom.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a palavra: ");
        String palavra = sc.next();
        System.out.println(palavra +  " é palíndromo? " + testaPalindromo(palavra));

    }

    public static boolean testaPalindromo(String palavra){
        // palavra original ADA
        // empilhando
        // A
        // D
        // A
        // Desempilhando
        // palavra inversa ADA
        //comparando palavra original com palavra inversa

        Pilha<Character> pilha = new Pilha<>();
        for(int i = 0; i < palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }
        String palavraInversa = "";
        while(!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }
        if(palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }
        return false;


    }
}

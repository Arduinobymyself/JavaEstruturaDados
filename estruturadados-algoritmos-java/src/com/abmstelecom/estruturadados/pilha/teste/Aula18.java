package com.abmstelecom.estruturadados.pilha.teste;

import com.abmstelecom.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);// to string
        System.out.println(stack.isEmpty());// está vazia
        System.out.println(stack.size());// tamanho
        System.out.println(stack.peek());// topo
        System.out.println(stack.pop());// remove e retorna o que foi removido
        System.out.println(stack);// to string

    }
}

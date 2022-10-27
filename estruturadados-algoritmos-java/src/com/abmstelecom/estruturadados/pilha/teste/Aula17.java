package com.abmstelecom.estruturadados.pilha.teste;

import com.abmstelecom.estruturadados.pilha.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        System.out.println("=== Empilhando ===");
        pilha.empilha(1);
        pilha.empilha(3);
        pilha.empilha(5);
        pilha.empilha(7);
        System.out.println(pilha);
        System.out.println("Topo da pilha " + pilha.topo());
        System.out.println("=== Desempilhando ===");
        pilha.desempilha();
        System.out.println(pilha);


    }

}

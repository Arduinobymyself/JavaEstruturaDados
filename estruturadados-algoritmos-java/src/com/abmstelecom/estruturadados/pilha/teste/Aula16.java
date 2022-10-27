package com.abmstelecom.estruturadados.pilha.teste;

import com.abmstelecom.estruturadados.pilha.Pilha;

public class Aula16 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        System.out.println(pilha.topo());
        pilha.empilha(1);
        pilha.empilha(3);
        pilha.empilha(5);
        pilha.empilha(7);
        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}

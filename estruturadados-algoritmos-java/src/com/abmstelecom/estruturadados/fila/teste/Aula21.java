package com.abmstelecom.estruturadados.fila.teste;

import com.abmstelecom.estruturadados.fila.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazia());
        System.out.println(fila.espiar());

        fila.enfileira(10);
        fila.enfileira(2);
        fila.enfileira(3);


        System.out.println(fila.estaVazia());
        System.out.println(fila.espiar()); // false

    }
}
package com.abmstelecom.estruturadados.fila.teste;

import com.abmstelecom.estruturadados.fila.Fila;

public class Aula22 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();



        fila.enfileira(1);
        fila.enfileira(10);
        fila.enfileira(2);
        fila.enfileira(13);

        System.out.println(fila.toString());
        System.out.println("Saiu: " + fila.desenfileira());
        System.out.println(fila.toString());

        System.out.println("Saiu: " + fila.desenfileira());
        System.out.println(fila.toString());

        System.out.println("Saiu: " + fila.desenfileira());
        System.out.println(fila.toString());

    }
}

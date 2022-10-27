package com.abmstelecom.estruturadados.vetor.teste;

import com.abmstelecom.estruturadados.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        System.out.println(vetor.tamanho());
        vetor.adiciona("F");
        vetor.adiciona("G");
        vetor.adiciona("H");
        System.out.println(vetor.tamanho());
        vetor.adiciona("I");
        vetor.adiciona("J");
        vetor.adiciona("K");
        vetor.adiciona("L");
        vetor.adiciona("M");
        vetor.adiciona("N");
        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());

    }
}

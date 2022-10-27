package com.abmstelecom.estruturadados.vetor.teste;

import com.abmstelecom.estruturadados.vetor.Vetor;
import jdk.swing.interop.SwingInterOpUtils;

public class Aula07 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        System.out.println(vetor.toString());
        System.out.println("----------------------------------");

        vetor.adiciona(0, "A");
        System.out.println(vetor.toString());
        System.out.println("----------------------------------");

        vetor.adiciona(3, "HELLO");
        System.out.println(vetor.toString());
        System.out.println("----------------------------------");

        System.out.println("tamanho: " + vetor.tamanho());
        vetor.adiciona(9, "WORLD"); // throws an Exception
        System.out.println(vetor.toString());
        System.out.println("----------------------------------");


    }
}

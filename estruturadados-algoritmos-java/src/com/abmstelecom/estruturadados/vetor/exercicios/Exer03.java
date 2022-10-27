package com.abmstelecom.estruturadados.vetor.exercicios;

import com.abmstelecom.estruturadados.vetor.Lista;

public class Exer03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println(lista);

        lista.remove(2); //remove posição 2 = C
        lista.remove("E"); //remove elemento E
        System.out.println(lista); // [A, B, D]


    }
}

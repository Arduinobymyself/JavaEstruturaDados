package com.abmstelecom.estruturadados.vetor.exercicios;

import com.abmstelecom.estruturadados.vetor.Lista;

public class Exer04 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println(lista);

        System.out.println(lista.obtem(2));

    }
}

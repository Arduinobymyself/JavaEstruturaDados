package com.abmstelecom.estruturadados.vetor.exercicios;

import com.abmstelecom.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));
        System.out.println("==========================================");


        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");

        System.out.println(lista.ultimoIndice("A"));
        System.out.println("==========================================");



    }
}

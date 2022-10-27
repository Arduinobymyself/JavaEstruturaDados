package com.abmstelecom.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);

        arrayList.add(1, "B");
        System.out.println(arrayList);

        boolean existe = arrayList.contains("B");
        if(existe){
            System.out.println("Elemento existe no array");
        }else{
            System.out.println("Elemento não existe no array");
        }

        int posicao = arrayList.indexOf("E");
        if(posicao > -1){
            System.out.println("Elemento existe no array na posição ");
        }else{
            System.out.println("Elemento não existe no array " + posicao);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("B");
        System.out.println(arrayList);

        System.out.println(arrayList.size());


    }
}

package com.abmstelecom.estruturadados.vetor.teste;

import com.abmstelecom.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");


        System.out.println("Vetor");
        System.out.println(vetor.toString());
        System.out.println("removento elemento do índice selecionado");
        vetor.remove(1);
        System.out.println(vetor.toString());

        System.out.println("Removendo o elemento E.");
        int pos = vetor.busca("E");
        if(pos > -1){
            vetor.remove(pos);
        }else{
            System.out.println("Elemento inexistente no vetor.");
        }
        System.out.println(vetor.toString());
    }
}

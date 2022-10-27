package com.abmstelecom.estruturadados.vetor.teste;

import com.abmstelecom.estruturadados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 0");
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        int indice = vetor.busca("Elemento 4");
        if(indice == -1){
            System.out.println("Elemento inexistente.");
        }else {
            System.out.println("elemento encontrado na posição: " + indice);
        }

    }
}

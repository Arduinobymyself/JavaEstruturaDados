package com.abmstelecom.estruturadados.vetor.teste;

import com.abmstelecom.estruturadados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        /* usado com a segunda opção de código
        try{

            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e){
            e.printStackTrace();
        }

         */

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

    }

}

package com.abmstelecom.estruturadados.vetor.teste;

import com.abmstelecom.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(10);

        vetor.adiciona("B");
        vetor.adiciona(3);
        vetor.adiciona(5.0);
        vetor.adiciona(-1);
        vetor.adiciona("F");

        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
        Contato c4 = new Contato("Contato 3", "3456-7890", "contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);


        System.out.println("Meu Vetor");
        System.out.println("Tamanho: " + vetor.tamanho());
        System.out.println(vetor);

        int pos = vetor.busca(c4);
        if(pos > -1){
            System.out.println("Elemente existe no vetor!");
        }else{
            System.out.println("Elemento inexistente no vetor!");

        }
    }
}

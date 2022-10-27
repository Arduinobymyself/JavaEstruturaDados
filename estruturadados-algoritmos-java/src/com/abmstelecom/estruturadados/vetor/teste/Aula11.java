package com.abmstelecom.estruturadados.vetor.teste;

import com.abmstelecom.estruturadados.vetor.Lista;
import com.abmstelecom.estruturadados.vetor.Vetor;
import com.abmstelecom.estruturadados.vetor.VetorObjetos;

public class Aula11 {
    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(1);
        vetor.adiciona("elemento tipo string");

        System.out.println(vetor);
        System.out.println("Por definição um vetor deveria aceitar somente elementos de um mesmo tipo!!!");
        System.out.println("----------------------------------");



        Lista<String> lista = new Lista<String>(2);
        lista.adiciona("Hello World");
        // lista.adiciona(1); //gera erro, pois espera string e está sendo passado outro tipo
        System.out.println(lista);
        System.out.println("----------------------------------");

        Lista<Contato> lista2 = new Lista<>(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");

        lista2.adiciona(c1);
        lista2.adiciona(c2);
        lista2.adiciona(c3);
        System.out.println(lista2);
        System.out.println("----------------------------------");
    }
}

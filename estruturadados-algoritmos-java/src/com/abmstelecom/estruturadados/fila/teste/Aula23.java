package com.abmstelecom.estruturadados.fila.teste;

import com.abmstelecom.estruturadados.fila.Classe1;
import com.abmstelecom.estruturadados.fila.Interface1;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {

        /*
        Classe1 c = new Classe1();
        c.adiciona();
        c.remove();
        c.teste();

        Interface1 i = new Classe1();
        i.adiciona();
        i.remove();
        // não tem o método teste, posi não pertence a Classe1

         */

        // não é possível instancia a Classe Queue porque ela é uma interface
        // desse modo devemos chamar uma Classe que implemente a Interface Queue
        // por exemplo a LinkedList
        //garantido o comportamento da Interface Queue chamada pela LinkedList
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1); // enqueue
        fila.add(2);
        System.out.println(fila); // toString
        System.out.println(fila.peek()); // observar
        System.out.println(fila.remove()); // desenfileirar
        System.out.println(fila);




    }
}

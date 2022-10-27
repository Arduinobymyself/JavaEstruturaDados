/*
Utilize a classe Pilha (criada durante as aulas) e desenvolva os seguintes itens:
1 - Crie uma pilha com capacidade para 20 livros;
2 - Insira 6 livros na pilha; Cada livro contém nome, isbn, ano de lançamento e autor;
3 - Crie um exemplo para utilizar cada método da classe Pilha.
 */

package com.abmstelecom.estruturadados.pilha.exercicios;

import com.abmstelecom.estruturadados.pilha.Pilha;

public class Exerc03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);

        Livro livro1 = new Livro();
        livro1.setNome("Livro1");
        livro1.setAutor("Autor1");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("123456zxc");

        Livro livro2 = new Livro();
        livro2.setNome("Livro2");
        livro2.setAutor("Autor2");
        livro2.setAnoLancamento(2017);
        livro2.setIsbn("78901vbnm");

        Livro livro3 = new Livro();
        livro3.setNome("Livro3");
        livro3.setAutor("Autor3");
        livro3.setAnoLancamento(2018);
        livro3.setIsbn("13467436bsas");

        Livro livro4 = new Livro();
        livro4.setNome("Livro4");
        livro4.setAutor("Autor4");
        livro4.setAnoLancamento(2019);
        livro4.setIsbn("sakl732j41lk");

        Livro livro5 = new Livro();
        livro5.setNome("Livro5");
        livro5.setAutor("Autor5");
        livro5.setAnoLancamento(2020);
        livro5.setIsbn("skaimnn31431m");

        Livro livro6 = new Livro();
        livro6.setNome("Livro6");
        livro6.setAutor("Autor6");
        livro6.setAnoLancamento(2021);
        livro6.setIsbn("1k2j143j1n3h");

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
        System.out.println("Empilhando livros: ");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);

        System.out.println(pilha.tamanho() + " livros empilhados.");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
        System.out.println("Espiando topo da pilha: " + pilha.topo());
        System.out.println("Desmpilhando livros: ");

        while(!pilha.estaVazia()){
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }
        System.out.println("Todos os livros forma desempilhados, pilha vazia. " + pilha.estaVazia());



    }
}

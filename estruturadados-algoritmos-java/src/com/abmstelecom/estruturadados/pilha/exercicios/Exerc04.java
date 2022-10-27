package com.abmstelecom.estruturadados.pilha.exercicios;

import com.abmstelecom.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Exerc04 {
    public static void main(String[] args) {
        Stack<Livro> stack = new Stack<>();

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

        System.out.println("Pilha de livros criada, pilha está vazia? " + stack.isEmpty());
        System.out.println("Empilhando livros: ");

        stack.push(livro1);
        stack.push(livro2);
        stack.push(livro3);
        stack.push(livro4);

        System.out.println(stack.size() + " livros empilhados.");
        System.out.println(stack);

        System.out.println("Pilha de livros criada, pilha está vazia? " + stack.isEmpty());
        System.out.println("Espiando topo da pilha: " + stack.peek());
        System.out.println("Desmpilhando livros: ");

        while(!stack.isEmpty()){
            System.out.println("Desempilhando livro: " + stack.pop());
        }
        System.out.println("Todos os livros forma desempilhados, pilha vazia. " + stack.isEmpty());
    }
}

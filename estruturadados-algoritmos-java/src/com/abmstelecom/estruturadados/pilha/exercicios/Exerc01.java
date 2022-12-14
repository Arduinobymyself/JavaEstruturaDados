/*
Escreva um programa que leia 10 n?meros.
Para cada n?mero lido verifique e codifique de acordo com as regras a seguir:
- se o n?mero for par, empilhe na pilha;
- se o n?mero for ?mpar, desempilhe um n?mero da pilha. Caso a pilha esteja vazia, mostre uma mensagem.
- se ao final do programa a pilha n?o estiver vazia, desempilhe todos os elementos, impimindo-os na tela.
 */

package com.abmstelecom.estruturadados.pilha.exercicios;

import com.abmstelecom.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Entre com um n?mero inteiro: ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println("Empilhando o n?mero " + num + " .");
                pilha.empilha(num);
            }else {
                Integer desempilhado = pilha.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha est? vazia.");
                }else{
                    System.out.println("N?mero ?mpar, desempilhando n?mero um elemento da pilha: " + desempilhado);
                }
            }
        }
        System.out.println("Todos os n?meros foram lidos, desempilhando n?meros da pilha.");

        while(!pilha.estaVazia()){
                System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
        }
        System.out.println("Todos os elementos foram desempilhados.");



    }
}

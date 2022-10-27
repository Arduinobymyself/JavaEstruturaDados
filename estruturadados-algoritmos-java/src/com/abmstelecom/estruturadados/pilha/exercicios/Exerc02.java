/*
Escreva um programa que leia 10 números.
Para cada número lido verifique e codifique de acordo com as regras a seguir:
- se o número for par, empilhe na pilha chamada par;
- se o número for ímpar, empilhe na pilha chamada impar.
- se o número for zero (0), desempilhe um elemento de cada pilha. Caso alguma pilha esteja vazia,
mostre uma mensagem de erro na tela.
Ao final do programa desempilhe todos os elementos das duas pilhas, imprimindo-osna tela.
 */

package com.abmstelecom.estruturadados.pilha.exercicios;

import com.abmstelecom.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Entre com um número: ");
            int num = sc.nextInt();

            if(num == 0){
                Integer desempilhado = par.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha par está vazia.");
                }else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }
                desempilhado = impar.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha ímpar está vazia.");
                }else {
                    System.out.println("Desempilhando da pilha ímpar: " + desempilhado);
                }


            }else if(num % 2 == 0){
                System.out.println("Número par, empilhando na pilha par: " + num);
                par.empilha(num);
            }else {
                System.out.println("Número ímpar, empilhando na pilha ímpar: " + num);
                impar.empilha(num);
            }

        }

        System.out.println("Desempilhando todos os números da pilha par.");
        while(!par.estaVazia()){
            System.out.println("Desemplihando da pilha par: " + par.desempilha());
        }
        System.out.println("Desempilhando todos os números da pilha ímpar.");
        while(!impar.estaVazia()){
            System.out.println("Desemplihando da pilha par: " + impar.desempilha());
        }
        System.out.println("todos os elementos desempilhados");


    }
}

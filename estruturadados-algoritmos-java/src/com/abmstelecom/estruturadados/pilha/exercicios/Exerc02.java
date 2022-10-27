/*
Escreva um programa que leia 10 n�meros.
Para cada n�mero lido verifique e codifique de acordo com as regras a seguir:
- se o n�mero for par, empilhe na pilha chamada par;
- se o n�mero for �mpar, empilhe na pilha chamada impar.
- se o n�mero for zero (0), desempilhe um elemento de cada pilha. Caso alguma pilha esteja vazia,
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
            System.out.println("Entre com um n�mero: ");
            int num = sc.nextInt();

            if(num == 0){
                Integer desempilhado = par.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha par est� vazia.");
                }else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }
                desempilhado = impar.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha �mpar est� vazia.");
                }else {
                    System.out.println("Desempilhando da pilha �mpar: " + desempilhado);
                }


            }else if(num % 2 == 0){
                System.out.println("N�mero par, empilhando na pilha par: " + num);
                par.empilha(num);
            }else {
                System.out.println("N�mero �mpar, empilhando na pilha �mpar: " + num);
                impar.empilha(num);
            }

        }

        System.out.println("Desempilhando todos os n�meros da pilha par.");
        while(!par.estaVazia()){
            System.out.println("Desemplihando da pilha par: " + par.desempilha());
        }
        System.out.println("Desempilhando todos os n�meros da pilha �mpar.");
        while(!impar.estaVazia()){
            System.out.println("Desemplihando da pilha par: " + impar.desempilha());
        }
        System.out.println("todos os elementos desempilhados");


    }
}

/*
Escreva um programa que simule a distribuição de senhas de atendimento a um grupo de pessoas.
Cada pessoa pode receber uma senha prioritária ou senha normal.
O programa deve obedecer os seguintes critérios:
- Existe apenas 1 atendente;
- 1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
- não havendo prioridades, as pessoas com senha normal podem ser atendidas.
 */


package com.abmstelecom.estruturadados.fila.exercicios;

import com.abmstelecom.estruturadados.fila.Fila;

public class Exerc02 {
    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        regular.enfileira("pessoa 1");
        regular.enfileira("pessoa 2");
        regular.enfileira("pessoa 3");
        prioridade.enfileira("pessoa 1-P");
        prioridade.enfileira("pessoa 2-P");
        prioridade.enfileira("pessoa 3-P");
        prioridade.enfileira("pessoa 4-P");
        prioridade.enfileira("pessoa 5-P");
        regular.enfileira("pessoa 4");
        regular.enfileira("pessoa 5");
        regular.enfileira("pessoa 6");
        regular.enfileira("pessoa 7");
        regular.enfileira("pessoa 8");

        while(!regular.estaVazia() || !prioridade.estaVazia()){
            int cont = 0;
            while(!prioridade.estaVazia() && cont < MAX_PRIORIDADE){
                atendePessoa(prioridade);
                cont++;
            }
            if(!regular.estaVazia()){
                atendePessoa(regular);
            }
            if(prioridade.estaVazia()){
                while(!regular.estaVazia()){
                    atendePessoa(regular);
                }
            }
        }
    }

    public static void atendePessoa(Fila<String> fila){
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida + " foi atendida. ");
    }
}

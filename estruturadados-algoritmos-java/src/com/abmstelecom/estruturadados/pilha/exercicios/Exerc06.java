/*
Escreva um programa para verificar se uma expressão matemática tem os
parênteses agrupados de forma correta, isto é:
1 - se o número de parênteses à esquerda e à direita são iguais;
2 - se todo parênteses aberto é seguido posteriormente por um fechamento de parênteses.
Exemplos:
((a+b) ou a+b( volam a condição 1
)a+b(-c ou (a+b))-(c+d violam a condição 2
((a+b)+d) está correta
 */


package com.abmstelecom.estruturadados.pilha.exercicios;

import com.abmstelecom.estruturadados.pilha.Pilha;

public class Exerc06 {
    public static void main(String[] args) {
        //testes
        imprimeResultado("a + b");
        imprimeResultado("a + b * ( c - d )");
        imprimeResultado("a + b * ( c - d )}");
        imprimeResultado("{[()]} * {[()]}");
        imprimeResultado("{[()} * {[()]}");
        imprimeResultado("a * b )");
        imprimeResultado("<h1> texto exemplo </h1>");



    }

    public static void imprimeResultado(String expressao){
        System.out.println(expressao + " está balanceado? " + verificaSimbolosBalanceados(expressao));
    }



    final static String ABRE = "([{<";
    final static  String FECHA = ")]}>";

    public static String getABRE() {
        return ABRE;
    }

    public static boolean verificaSimbolosBalanceados(String expressao){
        boolean balanceado = true;
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while(index < expressao.length()){
            simbolo = expressao.charAt(index);
            if(ABRE.indexOf(simbolo) > -1){
                pilha.empilha(simbolo);
            }else if(FECHA.indexOf(simbolo) > -1){
                if(pilha.estaVazia()){
                    return false;
                }else {
                    topo = pilha.desempilha();
                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }

            index++;
        }

        return true;
    }

}

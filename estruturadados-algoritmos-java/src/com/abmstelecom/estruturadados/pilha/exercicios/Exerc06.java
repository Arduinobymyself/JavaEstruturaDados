/*
Escreva um programa para verificar se uma express�o matem�tica tem os
par�nteses agrupados de forma correta, isto �:
1 - se o n�mero de par�nteses � esquerda e � direita s�o iguais;
2 - se todo par�nteses aberto � seguido posteriormente por um fechamento de par�nteses.
Exemplos:
((a+b) ou a+b( volam a condi��o 1
)a+b(-c ou (a+b))-(c+d violam a condi��o 2
((a+b)+d) est� correta
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
        System.out.println(expressao + " est� balanceado? " + verificaSimbolosBalanceados(expressao));
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

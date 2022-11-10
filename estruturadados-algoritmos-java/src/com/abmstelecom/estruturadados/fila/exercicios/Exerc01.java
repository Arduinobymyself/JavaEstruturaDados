/*
Usando a estrutura de dados Fila, crie uma fila de documentos que precisam ser impressos.
Cada documento é composto de um nome e quantidade de folhas a serem impressas.
O programa deve:
1 - enfileirar os documentos, seguindo a ordem;
2 - imprimir cada documento, desenfileirando da fila;
Se desejar pode usar Threads para esperar a impressão de acordo com o número de folhas a serem impressas.
 */


package com.abmstelecom.estruturadados.fila.exercicios;

import com.abmstelecom.estruturadados.fila.Fila;

public class Exerc01 {
    public static void main(String[] args) {
        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileira(new Documento("A", 10));
        filaImpressora.enfileira(new Documento("B", 20));
        filaImpressora.enfileira(new Documento("C", 30));
        filaImpressora.enfileira(new Documento("D", 70));
        filaImpressora.enfileira(new Documento("E", 90));

        while(!filaImpressora.estaVazia()){
            Documento doc = filaImpressora.desenfileira();
            System.out.println("Imprimindo documento " + doc.getNome());
            try{
                Thread.sleep(200 * doc.getNumeroFolhas());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Todos os documentos foram impressos");
    }
}

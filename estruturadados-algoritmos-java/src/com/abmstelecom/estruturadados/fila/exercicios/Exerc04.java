/*
Escreva um proigrama usando Filas que simule a brincadeira da Batata-quente.
A brincadeira consiste de um grupo de crian�as que fica em c�rculo, sentados ou em p�.
Uma crian�a fica fora da roda, de costas ou com olhos vendados, e dizendo a frase:
"Batata quente, quente, quente... queimou!"
Enquanto isso os demias v�o passando a bola de m�o em m�o at� ouvirem a palavra queimou.
Quem estiver com a bola nesse momento sai da roda. Ganha o �ltimo que sobrar.
 */


package com.abmstelecom.estruturadados.fila.exercicios;

import com.abmstelecom.estruturadados.fila.Fila;

import java.util.Random;

public class Exerc04 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        for (int i = 0; i < 10; i++){
            fila.enfileira(i);
        }

        Random aleatorio = new Random();
        int num = 0;
        while(num == 0){
            num = aleatorio.nextInt(10);
        }

        System.out.println("Numero = " + num);

        while(fila.tamanho() > 1){
            for(int i = 0; i < num; i++){
                fila.enfileira(fila.desenfileira());
            }
            System.out.println("Eliminado = " + fila.desenfileira());
        }
        System.out.println("ganhador = " + fila.desenfileira());
    }
}

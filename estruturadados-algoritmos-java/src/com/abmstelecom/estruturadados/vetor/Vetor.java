package com.abmstelecom.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /* este código funciona mas é ineficiente....
    public void adiciona(String elemento){
        for(int i = 0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
    */

    /* melhor porém ainda pode ser melhorado
    precisa do try catch no arquivo de teste
    public void adiciona(String elemento) throws Exception{

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
        }

    }
     */

    public void adiciona(String elemento){

        this.aumentaCapacidade();

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }

    }

    public int tamanho(){

        return this.tamanho;

    }

    @Override
    public String toString() {

        //maneira mais simples e intuitiva, porém menos eficiente usando concatenção de strings
        /*
        String str = "[";
        for(int i = 0; i<this.tamanho-1; i++){
            str += this.elementos[i];
            str += ", ";
        }
        if(this.tamanho > 0){
            str += this.elementos[this.tamanho-1];
        }
        str += "]";

        return str;
         */

        //maneira mais eficiente e profissional usando a classe StringBuilder do Java
        StringBuilder str = new StringBuilder();
        str.append("[");

        for(int i = 0; i<this.tamanho-1; i++){
            str.append(this.elementos[i]);
            str.append(", ");
        }
        if(this.tamanho > 0){
            str.append(this.elementos[tamanho-1]);
        }
        str.append("]");

        return str.toString();

    }

    public String busca(int posicao){

        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];

    }

    public int busca(String elemento){
        //algoritmo de busca sequencial
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;

    }

    //adiciona em qualquer posição - sobrecarga do método adiciona()
    // exemplo adicionar "A" na posição "0"
    // B C E F G - -
    // 0 1 2 3 4 5 6 -> tamanho = 5
    // vetor[5] = vetor[4]
    // vetor[4] = vetor[3]
    // vetor[3] = vetor[2]
    // vetor[2] = vetor[1]
    // vetor[1] = vetor[0]
    // vetor[0] = "A"
    public void adiciona(int posicao, String elemento){

        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        this.aumentaCapacidade();

        for(int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for(int i =0; i < this.tamanho; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }


    // B G D E F - posição a ser removida é 1 G
    // 0 1 2 3 4 - tamanho = 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posiçãoinválida!");
        }
        for(int i = posicao; i < tamanho - 1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }



}

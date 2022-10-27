package com.abmstelecom.estruturadados.vetor;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }


    public void adiciona(Object elemento){

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

    public Object busca(int posicao){

        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];

    }

    public int busca(Object elemento){
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
    public void adiciona(int posicao, Object elemento){

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
            Object[] elementosNovos = new Object[this.elementos.length * 2];
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

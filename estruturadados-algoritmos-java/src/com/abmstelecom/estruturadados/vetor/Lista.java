package com.abmstelecom.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    //tornando o vetor dinâmico
    // necessário novo construtor
    // solução do livro Effective Java
    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade]; // solução do livro Effective Java
        this.tamanho = 0;
    }

    //solução possível
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }


    public void adiciona(T elemento){

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

    public T busca(int posicao){

        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];

    }

    public int busca(T elemento){
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
    public void adiciona(int posicao, T elemento){

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
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
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

    //método comtém
    public boolean contem(T elemento){
        return busca(elemento) > -1; //>=0
    }

    //método último índice
    public int ultimoIndice(T elemento){
        int ultimaPosicao = -1;
        for(int i = this.tamanho-1; i >= 0; i--){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    //metodo remove elemento
    public void remove(T elemento){
        int pos = this.busca(elemento);
        if(pos > -1){
            this.remove(pos);
        }
    }

    //metodo obtém
    public T obtem(int posicao){
        return this.busca(posicao);
    }

    //remover todos os elementos
    public void limpar(){
        //opção 1 - eficaz, mas pouco usual
        //this.elementos = (T[]) new Object[this.elementos.length];

        //opção 2 - deixa lixo nos endereços de memória
        // this.tamanho = 0;

        //opção 3 - pode ser custoso dependendo do tamanho do vetor, mas libera memória
        for (int i = 0; i < this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }


}

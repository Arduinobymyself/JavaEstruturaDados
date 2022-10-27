package com.abmstelecom.estruturadados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    //tornando o vetor dinâmico
    // necessário novo construtor
    // solução do livro Effective Java
    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade]; // solução do livro Effective Java
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    protected boolean adiciona(T elemento){

        this.aumentaCapacidade();

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;

    }

    protected boolean adiciona(int posicao, T elemento){

        if(!(posicao >= 0 || posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        this.aumentaCapacidade();

        for(int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
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


    protected void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        for(int i = posicao; i < tamanho - 1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }
}

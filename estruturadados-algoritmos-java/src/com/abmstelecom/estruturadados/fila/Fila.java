package com.abmstelecom.estruturadados.fila;

import com.abmstelecom.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileira(T elemento){
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++;

        //ou simplificando...
        //this.elementos[this.tamanho++] = elemento;

        //ou mais eficiente
        this.adiciona(elemento);
    }

    public T espiar(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira(){
        final int POS = 0;

        if(this.estaVazia()){
            return null;
        }
        T elemetoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elemetoASerRemovido;
    }

}

package com.abmstelecom.estruturadados.pilha;

import com.abmstelecom.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha() {
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    // MÉTODOS DA CLASSE PILHA

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public T desempilha(){
        if(this.estaVazia()){
            return null;
        }

        /*
        T elemento = this.elementos[tamanho - 1];
        tamanho--;
        return elemento;
        */

        //simplificando....
        return this.elementos[--tamanho];

    }













}

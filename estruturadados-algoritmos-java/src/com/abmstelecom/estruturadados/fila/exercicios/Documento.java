package com.abmstelecom.estruturadados.fila.exercicios;

public class Documento {
    private String nome;
    private int numeroFolhas;

    public Documento(String nome, int numeroFolhas) {
        this.nome = nome;
        this.numeroFolhas = numeroFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }

    public void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }
}

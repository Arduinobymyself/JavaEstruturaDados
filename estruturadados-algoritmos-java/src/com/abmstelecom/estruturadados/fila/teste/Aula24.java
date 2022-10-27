package com.abmstelecom.estruturadados.fila.teste;

import com.abmstelecom.estruturadados.fila.FilaComPrioridade;
import com.abmstelecom.estruturadados.fila.Paciente;

public class Aula24 {
    public static void main(String[] args) {

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<Paciente>();
        fila.enfileira(new Paciente("A", 2));
        fila.enfileira(new Paciente("B", 1));
        fila.enfileira(new Paciente("C", 3));


        System.out.println(fila);
        System.out.println(fila.desenfileira());
        System.out.println(fila);
    }
}

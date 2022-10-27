package com.abmstelecom.estruturadados.fila.teste;

import com.abmstelecom.estruturadados.fila.Paciente;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Integer> filaComPrioridade = new PriorityQueue<>();
        Queue<Paciente> filaPacienteComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add(3);
        filaComPrioridade.add(2);
        filaComPrioridade.add(1);
        System.out.println(filaComPrioridade);

        filaPacienteComPrioridade.add(new Paciente("A", 2));
        filaPacienteComPrioridade.add(new Paciente("B", 1));
        filaPacienteComPrioridade.add(new Paciente("C", 3));
        System.out.println(filaPacienteComPrioridade);



    }
}

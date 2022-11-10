/*
Utilize a classe Fila para simular um sistema de senhas de um pronto socorro.
Cada pessoa pode ser classificada com 3 c�digos: vermelho - de prioridade maior, amarelo - prioridade m�dia
e verde - quando a situa��o n�o � grave e a pessoa pode esperar mais tempo.
O programa deve obedecer �s seguintes condi��es:
Enfileire 6 pessoas na fila inicial.
Pessoas com prioridade vermelha devem ser atendidas primiero;
Cada consulta dura cerca de 5 segundos, e depois o pr�ximo da fila � chamado.
A cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleat�ria
(Crie um c�digo java para criar aleatoridade).
 */


package com.abmstelecom.estruturadados.fila.exercicios;

import com.abmstelecom.estruturadados.fila.FilaComPrioridade;

public class Exerc03 {

    public static final int VERDE = 2;
    public static final int  AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
        fila.enfileira(new Pessoa("Pessoa 1", VERDE));
        fila.enfileira(new Pessoa("Pessoa 2", AMARELO));
        fila.enfileira(new Pessoa("Pessoa 3", VERMELHO));
        fila.enfileira(new Pessoa("Pessoa 4", VERDE));
        fila.enfileira(new Pessoa("Pessoa 5", VERDE));
        fila.enfileira(new Pessoa("Pessoa 6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);
        t1.start();
        t2.start();


    }


}

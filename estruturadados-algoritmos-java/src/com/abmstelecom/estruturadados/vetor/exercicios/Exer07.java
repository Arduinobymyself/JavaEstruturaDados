package com.abmstelecom.estruturadados.vetor.exercicios;


import com.abmstelecom.estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06{
    public static void main(String[] args) {
        //  criação das variáveis
        Scanner scan = new Scanner(System.in);

        // criar vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<>(20);

        // criar e adiconar 30 contatos
        criarContatosDinamicamente(5, lista);

        //criar um menu para que o usuário escolha a opção
        int opcao = 1;
        while (opcao != 0){
            opcao = obterOpcaoMenu(scan);
            switch (opcao) {
                case 1 -> adicionarContatoFinal(scan, lista);
                case 2 -> adicionarContatoPosicao(scan, lista);
                case 3 -> obtemContatoPosicao(scan, lista);
                case 4 -> obtemContato(scan, lista);
                case 5 -> pesquisarUltimoIndice(scan, lista);
                case 6 -> pesquisaContatoExiste(scan, lista);
                case 7 -> excluirPorPosicao(scan, lista);
                case 8 -> excluirContato(scan, lista);
                case 9 -> imprimeTamanhoVetor(lista);
                case 10 -> limparVetor(lista);
                case 11 -> imprimirVetor(lista);
                default -> {
                }
            }


        }
        System.out.println("Obrigado por Consultar a Agenda, volte sempre!");

    }
    //MÉTODOS -----------------------------------------------------------------



    private static void imprimirVetor(ArrayList<Contato> lista){
        System.out.println(lista);
    }

    private static void limparVetor(ArrayList<Contato> lista){
        lista.clear();
        System.out.println("Todos os contados foram removidos!");
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista){
        System.out.println("Tamanho da Agenda é de: " + lista.size());
    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida: ", scan);
        try{
            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato excluído!");
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida: ", scan);
        try{
            lista.remove(pos);
            System.out.println("Contato excluído!");
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisaContatoExiste(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
        try{
            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);
            if (existe){
                System.out.println("Contato existente, segue informações: ");
                System.out.println(contato);
            }else{
                System.out.println("Contato inexistente!");
            }
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
        try{
            Contato contato = lista.get(pos);
            System.out.println("Contato existente, segue informações: ");
            System.out.println(contato);
            System.out.println("Fazendo a pesquisa do último índice do contato encontrado: ");
            pos = lista.lastIndexOf(contato);
            System.out.println("Contato encontrado na posição " + pos);
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
        try{
            Contato contato = lista.get(pos);
            System.out.println("Contato existente, segue informações: ");
            System.out.println(contato);
            System.out.println("Fazendo a pesquisa do contato encontrado: ");
            pos = lista.indexOf(contato);
            System.out.println("Contato encontrado na posição " + pos);
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
        try{
            Contato contato = lista.get(pos);
            System.out.println("Contato existente, segue informações: ");
            System.out.println(contato);
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista){
        System.out.println("Criando contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista){
        System.out.println("Criando contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        int pos = leInformacaoInt("Entre com a posição a adicionar o contato: ", scan);

        try{
            lista.add(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        }catch(Exception e){
            System.out.println("Posição inválida, contato não adicionado.");
        }
    }



    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista){
        Contato contato;
        for(int i = 0; i <= quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1234-000" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);

        }
    }


}

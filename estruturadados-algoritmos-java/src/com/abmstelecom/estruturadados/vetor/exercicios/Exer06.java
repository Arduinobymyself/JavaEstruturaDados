package com.abmstelecom.estruturadados.vetor.exercicios;

import com.abmstelecom.estruturadados.vetor.Lista;
import com.abmstelecom.estruturadados.vetor.teste.Contato;


import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        //  criação das variáveis
        Scanner scan = new Scanner(System.in);

        // criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);

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



    private static void imprimirVetor(Lista<Contato> lista){
        System.out.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista){
        lista.limpar();
        System.out.println("Todos os contados foram removidos!");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho da Agenda é de: " + lista.tamanho());
    }

    private static void excluirContato(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida: ", scan);
        try{
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato excluído!");
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida: ", scan);
        try{
            lista.remove(pos);
            System.out.println("Contato excluído!");
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisaContatoExiste(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
        try{
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);
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

    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
        try{
            Contato contato = lista.busca(pos);
            System.out.println("Contato existente, segue informações: ");
            System.out.println(contato);
            System.out.println("Fazendo a pesquisa do último índice do contato encontrado: ");
            pos = lista.ultimoIndice(contato);
            System.out.println("Contato encontrado na posição " + pos);
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
        try{
            Contato contato = lista.busca(pos);
            System.out.println("Contato existente, segue informações: ");
            System.out.println(contato);
            System.out.println("Fazendo a pesquisa do contato encontrado: ");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição " + pos);
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
        try{
            Contato contato = lista.busca(pos);
            System.out.println("Contato existente, segue informações: ");
            System.out.println(contato);
        }catch(Exception e){
            System.out.println("Posição inválida!");
        }

    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista){
        System.out.println("Criando contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista){
        System.out.println("Criando contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        int pos = leInformacaoInt("Entre com a posição a adicionar o contato: ", scan);

        try{
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        }catch(Exception e){
            System.out.println("Posição inválida, contato não adicionado.");
        }
    }

    protected static String leInformacao(String msg, Scanner scan){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    protected static int leInformacaoInt(String msg, Scanner scan){
        boolean entradaValida = false;
        int num = 0;

        while(!entradaValida){
            try{
                System.out.println(msg);
                String entrada = scan.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            }catch(Exception e){
                System.out.println("Entrada inválida, digite novamente");
            }
        }


        return num;
    }

    protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){
        Contato contato;
        for(int i = 0; i <= quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1234-000" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);

        }
    }

    protected static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;
        while(!entradaValida){
            System.out.println("==============================================");
            System.out.println("=            AGENDA ELETRONICA               =");
            System.out.println("==============================================");
            System.out.println("Digite a opção desejada:");
            System.out.println("==============================================");
            System.out.println("0  - Sair");
            System.out.println("1  - Adiciona contato ao final");
            System.out.println("2  - Adiciona em posição específica");
            System.out.println("3  - Obtém contato em posição específica");
            System.out.println("4  - Consulta por contato");
            System.out.println("5  - Consulta último índice do contato");
            System.out.println("6  - Verifica se contato existe");
            System.out.println("7  - Excluir por posicção");
            System.out.println("8  - Excluir por contato");
            System.out.println("9  - Verifica tamanho da Agenda");
            System.out.println("10 - Excluir toda Agenda");
            System.out.println("11 - Imprimir Agenda");

            try{
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                if(opcao >= 0 && opcao <= 11){
                    entradaValida = true;
                }else{
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println("\n\nEntrada Inválida, Digite novamente");
            }
        }

        return opcao;
    }

}

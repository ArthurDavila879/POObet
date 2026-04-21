/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet.domain;

import java.util.ArrayList;
import java.util.List;


public class Jogador {
    private static int contadorId = 1;

    private int idJogador;
    private String nome;
    private String sobrenome;
    private String apelido;
    private String cpf;
    private String nacionalidade;
    private String dataNascimento;
    private Credito credito;
    public List<Aposta> minhasApostas = new ArrayList<>();

    public void menu() {
        int opcao;
        boolean loop = true;
        while (loop) {
            opcao = InOut.leInt("1: Ver as apostas disponíveis\n" +
                    "2: Apostar \n" +
                    "3: Ver minhas apostas\n" +
                    "4: Resultado\n" +
                    "5: Excluir apostas\n" +
                    "6: Usuário\n" +
                    "7: Sair");

            switch (opcao) {
                case 1:

                    Jogo.imprimirJogos();
                    break;

                case 2:
                    int id = InOut.leInt("Insira o id do jogo");
                    double valor = InOut.leDouble("Insira o valor da aposta");

                    Jogo jogoEscolhido = Jogo.getJogoById(id);

                    if (jogoEscolhido == null) {
                        InOut.MsgDeAviso("Erro", "Jogo não encontrado");
                        break;
                    }

                    if (!credito.isBloqueado() && valor <= credito.getSaldo() && valor <=  jogoEscolhido.getApostaMax()) {
                        credito.setSaldo(credito.getSaldo() - valor);
                        Aposta apostado = new Aposta(true, valor, 1);
                        apostado.apostarJogo(id);
                        minhasApostas.add(apostado);
                        break;
                    } else InOut.MsgDeAviso("Erro", "Aposta invalida");
                    break;

                case 3:
                    for (Aposta a : minhasApostas) {
                        a.verApostas();
                    }
                    break;

                case 4:
                    for (Aposta a : minhasApostas) {
                        double resultadoDaAposta = a.resultadoDaAposta();
                        this.credito.setSaldo(this.credito.getSaldo() + (resultadoDaAposta * a.getValorAposta()));
                        if (resultadoDaAposta !=0 ) {
                            InOut.MsgDeInformacao("Aposta", "A Aposta do jogo " + a.getIdAposta() + " foi vencida, seu saldo atual é " + this.credito.getSaldo());
                        } else
                            InOut.MsgDeInformacao("Aposta", "A Aposta do jogo " + a.getIdAposta() + " foi perdida, seu saldo atual é " + this.credito.getSaldo());

                    }
                    minhasApostas.clear();
                    break;

                case 5:
                    int id_remove = InOut.leInt("Insira o id do jogo que você quer remover");
                    minhasApostas.removeIf(a -> a.getIdAposta() == id_remove);
                    break;

                case 6:
                    InOut.MsgDeInformacao("Usuario", "Nome: " + this.nome + " " + this.sobrenome + "\nApelido: " + this.apelido + "\nSaldo: " + credito.getSaldo() + "\nCPF: " + this.cpf + "\nNacionalidade: " + this.nacionalidade);
                    break;

                case 7:
                    loop = false;
                    break;

                default:
                    InOut.MsgDeAviso("Aviso", "Opcao invalida");

            }


        }
    }

    public void cadastrar() {
        this.idJogador = contadorId++;
        this.nome = InOut.leString("Insira seu nome");
        this.sobrenome = InOut.leString("Insira seu sobrenome");
        this.apelido = InOut.leString("Insira seu apelido");
        this.cpf = InOut.leString("Insira seu cpf");
        this.nacionalidade = InOut.leString("Insira sua nacionalidade");
        this.dataNascimento = InOut.leString("Insira sua data de nascimento");
        InOut.MsgDeInformacao("Credito", "Seu credito inicial é 500");
    }


    public Jogador() {
        this.idJogador = contadorId++;
    }



    public void setCredito(Credito credito) {
        this.credito = credito;
    }
}

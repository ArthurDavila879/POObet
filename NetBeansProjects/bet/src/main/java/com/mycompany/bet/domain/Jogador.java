/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet.domain;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
    public Aposta listaDeApostas;
    public List<Aposta> minhasApostas = new ArrayList<>();

    public void menu() {
        int opcao = 0;

        while (opcao != 5) {
            opcao = InOut.leInt("1: Ver as apostas disponíveis\n" +
                    "2: Apostar \n" +
                    "3: Ver minhas apostas\n" +
                    "4: Resultado\n" +
                    "5: Sair");

            switch (opcao) {
                case 1:

                    listaDeApostas.consultarJogos();
                    break;

                case 2:
                    int id = InOut.leInt("Insira o id do jogo");
                    int valor = InOut.leInt("Insira o valor da aposta");
                    if (!credito.isBloqueado() && valor <= credito.getSaldo()) {
                        credito.setSaldo(credito.getSaldo()-valor);
                        Aposta apostado = new Aposta(true, valor, 1);
                        apostado.apostarJogo(id);
                        minhasApostas.add(apostado);
                        break;
                    }
                    break;
                case 3:
                    for (Aposta a : minhasApostas) {
                        a.verApostas();
                    }
                    break;
                case 4:
                    for (Aposta a : minhasApostas) {
                        this.credito.setSaldo(this.credito.getSaldo() + (a.resultadoDaAposta()*a.getValorAposta())) ;
                        if (a.resultadoDaAposta() == 2){
                            InOut.MsgDeInformacao("Aposta","Aposta ganha, seu saldo atual é "+this.credito.getSaldo());
                        }
                        else InOut.MsgDeInformacao("Aposta","Aposta perdida, seu saldo atual é "+this.credito.getSaldo());
                    }
                 break;
            }

        }
    }
    public void cadastrar(){
        this.idJogador = contadorId++;
        this.nome = InOut.leString("Insira seu nome");
        this.sobrenome = InOut.leString("Insira seu sobrenome");
        this.apelido= InOut.leString("Insira seu apelido");
        this.cpf =  InOut.leString("Insira seu cpf");
        this.nacionalidade = InOut.leString("Insira sua nacionalidade");
        this.dataNascimento = InOut.leString("Insira sua data de nascimento");
        InOut.MsgDeInformacao("Credito","Seu credito inicial é 500");
    }
    
    
    public Jogador() {
        this.idJogador = contadorId++;
    }

    public Aposta getListaDeApostas() {
        return listaDeApostas;
    }

    public void setListaDeApostas(Aposta listaDeApostas) {
        this.listaDeApostas = listaDeApostas;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }
}

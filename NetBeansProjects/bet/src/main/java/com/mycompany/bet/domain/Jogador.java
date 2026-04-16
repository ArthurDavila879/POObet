/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Jogador {
    private int idJogador;
    private String nome;
    private String sobrenome;
    private String apelido;
    private String cpf;
    private String nacionalidade;
    private Date dataNascimento;
    private Credito credito;
    public List<Aposta> listaDeApostas = new ArrayList<>();
    
    public void menu(){
       
        int opcao = InOut.leInt("Deseja ver os jogos? 1 ou 0");
        if(opcao == 1){
            for(Aposta a: listaDeApostas){
                a.consultarJogos();
            }
        }
    }
    
    
    public Jogador() {
    }

    public Jogador(int idJogador, String nome, String sobrenome, String apelido, String cpf, String nacionalidade, Date dataNascimento, Credito credito) {
        this.idJogador = idJogador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.credito = credito;
    }
    
    
}

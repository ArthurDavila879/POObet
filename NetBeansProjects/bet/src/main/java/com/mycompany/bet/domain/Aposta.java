/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab10
 */
public class Aposta {
    
    private int idAposta;
    private boolean confirmado;
    private double valorAposta;
    private int repetir;
    private Jogo jogo;

    public List<Jogo> jogosApostados = new ArrayList<>();

    public Aposta() {
    }

    public Aposta(int idAposta, boolean confirmado, double valorAposta, int repetir) {
        this.idAposta = idAposta;
        this.confirmado = confirmado;
        this.valorAposta = valorAposta;
        this.repetir = repetir;
    }
    
    public void apostarJogo(int idJogo){
        for (Jogo j: Jogo.jogos){
            if (j.getIdJogo()== idJogo){
               jogosApostados.add(j);
               InOut.MsgDeAviso("Aviso","Jogo apostado");
            }
        }
    }
    public void verApostas(){
        for (Jogo j: Jogo.jogos){
            j.imprimirJogo();
        }
    }
    
    public void consultarJogos(){
    jogo.imprimirJogos();
}

    public void valorApostado() {
        InOut.MsgDeInformacao("Valor ","Valor apostado: "+this.valorAposta ); 
    }



    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}

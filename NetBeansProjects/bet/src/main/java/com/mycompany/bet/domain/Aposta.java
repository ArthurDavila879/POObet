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
    private List<Jogo> listaDeJogos = new ArrayList<>();

    public Aposta() {
    }

    public Aposta(int idAposta, boolean confirmado, double valorAposta, int repetir) {
        this.idAposta = idAposta;
        this.confirmado = confirmado;
        this.valorAposta = valorAposta;
        this.repetir = repetir;
    }
    
    
    
    public void consultarJogos(){
     for(Jogo j: listaDeJogos){
         InOut.MsgDeInformacao("Jogos","Descrição: "+j.descritivo+"\nAposta maxima: "+j.apostaMax+"\nPremio maximo: "+j.premioMax);
    }
    
}

    public void valorApostado() {
        InOut.MsgDeInformacao("Valor ","Valor apostado: "+this.valorAposta ); 
    }
}

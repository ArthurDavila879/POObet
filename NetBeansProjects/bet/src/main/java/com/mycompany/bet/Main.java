/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet;

import com.mycompany.bet.domain.Aposta;
import com.mycompany.bet.domain.Credito;
import com.mycompany.bet.domain.Jogador;
import com.mycompany.bet.domain.Jogo;

public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();
        Aposta aposta = new Aposta();
        Jogo jogo = new Jogo();
        Credito credito = new Credito();

        jogador.setListaDeApostas(aposta);
        aposta.setJogo(jogo);
        jogador.setCredito(credito);


      jogador.menu();


    }
}

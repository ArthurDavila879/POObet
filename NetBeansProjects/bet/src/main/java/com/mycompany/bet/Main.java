/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet;

import com.mycompany.bet.domain.Credito;
import com.mycompany.bet.domain.Jogador;

public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();
        Credito credito = new Credito();

        jogador.setCredito(credito);

      jogador.cadastrar();
      jogador.menu();


    }
}

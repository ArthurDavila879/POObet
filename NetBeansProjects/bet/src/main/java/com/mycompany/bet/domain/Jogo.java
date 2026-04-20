/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Jogo {
    int idJogo;
    String descritivo;
    double apostaMax;
    double premioMax;
    double odd = 2;
    
public static List<Jogo> jogos = List.of(
    new Jogo(1,"Flamengo vai ganhar do Palmeiras?", 500, 2500),
    new Jogo(2,"Lakers vai ganhar do Warriors?", 300, 1800),
    new Jogo(3,"FURIA vai ganhar da NAVI (CS2)?", 200, 1500),
    new Jogo(4,"Max Verstappen vai ganhar o GP do Brasil?", 400, 3000),
    new Jogo(5,"Real Madrid vai ganhar do Manchester City?", 600, 3500)
);


    public Jogo(){}
    
    public Jogo(int idJogo, String descritivo, double apostaMax, double premioMax){
        this.idJogo = idJogo;
        this.descritivo = descritivo;
        this.apostaMax = apostaMax;
        this.premioMax = premioMax;
    }

    public void imprimirJogos(){
        for (Jogo j: jogos){
            InOut.MsgDeInformacao("Jogos","ID: "+j.idJogo+"\nDescrição: "+j.descritivo+"\nAposta maxima: "+j.apostaMax+"\nPremio maximo: "+j.premioMax);

        }
    }
    public void imprimirJogo(Jogo j){
        InOut.MsgDeInformacao("Jogos","ID: "+j.idJogo+"\nDescrição: "+j.descritivo+"\nAposta maxima: "+j.apostaMax+"\nPremio maximo: "+j.premioMax);
    }
    
public int resultado(){
    Random random = new Random();
    boolean resultado;
    resultado = random.nextBoolean();
    
    if(resultado){
        return 1;
    }
    return 0;
}

    public int getIdJogo() {
        return idJogo;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Jogo {
    private int idJogo;
    private String descritivo;
    private double apostaMax;
    private double premioMax;
    private double odd;
    
public static List<Jogo> jogos = List.of(
    new Jogo(1,"Flamengo vai ganhar do Palmeiras?", 500, 2500,5),
    new Jogo(2,"Lakers vai ganhar do Warriors?", 300, 1800,6),
    new Jogo(3,"FURIA vai ganhar da NAVI (CS2)?", 200, 1500,7.5),
    new Jogo(4,"Max Verstappen vai ganhar o GP do Brasil?", 400, 3000,7.5),
    new Jogo(5,"Real Madrid vai ganhar do Manchester City?", 600, 3500,5.8)
);


    public Jogo(){}
    
    public Jogo(int idJogo, String descritivo, double apostaMax, double premioMax,double odd){
        this.idJogo = idJogo;
        this.descritivo = descritivo;
        this.apostaMax = apostaMax;
        this.premioMax = premioMax;
        this.odd = odd;
    }

    public static void imprimirJogos(){
        for (Jogo j: jogos){
            InOut.MsgDeInformacao("Jogos","ID: "+j.idJogo+"\nDescrição: "+j.descritivo+"\nAposta maxima: "+j.apostaMax+"\nPremio maximo: "+j.premioMax+"\nODD: "+j.odd);

        }
    }
    public static void imprimirJogo(Jogo j){
        InOut.MsgDeInformacao("Jogos","ID: "+j.idJogo+"\nDescrição: "+j.descritivo+"\nAposta maxima: "+j.apostaMax+"\nPremio maximo: "+j.premioMax+"\nODD: "+j.odd);
    }

    public boolean resultado() {
        return new Random().nextBoolean();
    }

    public static Jogo getJogoById(int id) {
        return jogos.stream()
                .filter(j -> j.getIdJogo() == id)
                .findFirst()
                .orElse(null);
    }

    public int getIdJogo() {
        return idJogo;
    }

    public double getApostaMax() {
        return apostaMax;
    }

    public double getOdd() {
        return odd;
    }
}
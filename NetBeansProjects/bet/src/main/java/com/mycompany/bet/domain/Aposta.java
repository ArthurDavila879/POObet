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
    private static int contadorId = 1;

    private int idAposta;
    private boolean confirmado;
    private double valorAposta;
    private int repetir;
    private Jogo jogo;

    public List<Jogo> jogosApostados = new ArrayList<>();

    public Aposta() {
    }

    public Aposta(boolean confirmado, double valorAposta, int repetir) {
        this.idAposta = contadorId++;
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
        for (Jogo j: jogosApostados){
            j.imprimirJogo(j);
        }
        InOut.MsgDeInformacao("Aposta","Valor apostado: " +this.valorAposta);
    }
    
    public void consultarJogos(){
    jogo.imprimirJogos();
}

    public void excluirAposta(int idjogo){
        jogosApostados.removeIf(jogo -> jogo.getIdJogo() == idjogo);
        InOut.MsgDeInformacao("Aviso","Aposta excluida");
    }

  public double resultadoDaAposta(){
        for (Jogo j: jogosApostados){
            if (j.resultado() ==1){
                return j.odd;
            }

        }
      return 0;
  }



    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public double getValorAposta() {
        return valorAposta;
    }

    public int getIdAposta() {
        return idAposta;
    }

    public Jogo getJogo(int id) {
       return jogo.getJogoById(id);
    }

}

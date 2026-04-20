/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bet.domain;

public class Credito {
    private double saldo = 500;
    private String validade;
    private String moeda;
    private boolean bloqueado;
    
    public Credito(){}
    
    public Credito(double saldo, String validade, String moeda, boolean bloqueado){
        this.saldo = saldo;
        this.validade = validade;
        this.moeda = moeda;
        this.bloqueado = bloqueado;
    }
    public void imprimirInfo(){

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }
}
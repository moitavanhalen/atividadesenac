/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadesenac;

/**
 *
 * @author arthur.mpenteado
 */
public class valores {

    private double peso;
    private double altura;
    private double imc;
    private String situação;
    
    public valores(double peso, double altura){
        setPeso(peso);
        setAltura(altura);
        calculaIMC();
    }
    private void calculaIMC(){
        imc = this.peso / (this.altura * this.altura);
    }
    
    
    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }

    /**
     * @return the situação
     */
    public String getSituação() {
        return situação;
    }

    /**
     * @param situação the situação to set
     */
    public void setSituação(String situação) {
        this.situação = situação;
    }
}

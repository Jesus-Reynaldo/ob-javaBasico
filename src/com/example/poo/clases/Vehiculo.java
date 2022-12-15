package com.example.poo.clases;

public abstract class Vehiculo {
    //1. atributos
    protected String fabricante;
    /**tipo envoltorio(Clase) que puede permitir valores nulos,
    *bueno utilizar cuando trabajamos
     * */
    protected String modelo;
    //double tipo primitivo
    protected double cc;
    protected int anio;
    protected boolean sport;
    protected int velocidad;
    protected Motor motor;
    //2. constructores

    public Vehiculo() {

    }

    public Vehiculo(String fabricante,String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.velocidad=0;
    }

    public Vehiculo(String fabricante, int anio) {
        this.fabricante = fabricante;
        this.anio = anio;
    }

    public Vehiculo(String fabricante, String modelo, double cc, int anio, boolean sport, int velocidad, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.anio = anio;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    //3. metodos (comportamiento
    //es el comportamineto
    public void acelerar(int cantidad){
        if(cantidad>0 && cantidad<120)
            this.velocidad+=cantidad;
    }

}

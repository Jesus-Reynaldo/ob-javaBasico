package com.example.poo.herencia;

import com.example.poo.clases.Motor;
import com.example.poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;

    public Motocicleta(String fabricante, String modelo, double cc, int anio, boolean sport, int velocidad, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, anio, sport, velocidad, motor);
        this.baul = baul;
    }
    public Motocicleta(){

    }
}

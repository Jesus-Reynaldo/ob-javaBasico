package com.example.estructurascontrol.condicionales;

public class CondicionIfElse {
    public static void main(String[] args) {
        int edad = 19;
        boolean esMayor = edad >= 18;//false
        if (esMayor) {//si true entra aqui
            System.out.println("Es mayor de edad");
        } else {//si false entra aqui
            System.out.println("Es menor de edad");
        }

    }
}

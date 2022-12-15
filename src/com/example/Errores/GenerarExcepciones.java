package com.example.Errores;

import java.io.IOException;
import java.util.Scanner;

public class GenerarExcepciones {
    public static void main(String[] args) {
        try {
            divide(4,0);
        }catch (Exception e) {
            System.out.println("AAA");
        }
    }
    public static int divide(int numeroA, int numeroB) throws ArithmeticException, IOException {
        int resultado = 0;
        try {
            resultado = numeroA/numeroB;
        }catch (ArithmeticException e){
            System.out.println("Oye, esto esta mal");
            throw new IOException();
        }
        return resultado;
    }
}

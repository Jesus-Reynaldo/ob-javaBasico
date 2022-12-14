package com.example;

/**
 * Sobrecarga permite duplicar un metodo siempre y cuando tenga diferente numero/tipo parametros.
 */
public class SobreCarga {
    public static void main(String[] args) {

    }
    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    private static double suma(double numero1, int numero2) {
        return numero1 + numero2;
    }
    private static int suma(int numero1, int numero2, int numero3) {
        return numero1 + numero2;
    }
}

package com.example.Errores;

import java.util.Scanner;

public class GestionErrores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();
        try {
            int resultado = numeroA/numeroB;
            System.out.println("Resultado es: "+resultado);
        }catch (Exception e) {
            System.out.println("Boom!, exception es: "+e.getClass());
            e.printStackTrace();
        }finally {
            System.out.println("Se ejecuta luego del try o catch");
        }
    }
}

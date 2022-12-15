package com.example.Errores;

import java.util.Scanner;

public class TiposErrores {
    public static void main(String[] args) {
        /**
         * error en tiempo de ejecucion: es una situacion que cuerre en
         * el programa en la cual no se esta preparado, hace que programa no aborde
         * es muy sencillo de no terne en cuenta
         * es por lo que no se valida bien los valores introducidos por los usuarios
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();
        int resultado = numeroA/numeroB;
        System.out.println("Resultado es: "+resultado);
        /**
         * Error de compilacion es un error sintactico
         */
        //System.out.println("Error sintexis")
        /**
         * Error logico, son los peor porque no se pueden dar cuenta, condicionalmente es incorrecto
         */
        int temperature = 25;
        if(temperature>=25){
            System.out.println("Hace frio");
        }
    }
}

package com.example.EntradaSalida;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        boolean oki = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete un numero");
           // scanner.reset();//reinicia el scanner desde el escaner
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Enteros son: "+a+" "+b);

                oki = true;
            } catch (InputMismatchException e) {
                System.out.println("Numeros invalidos "+ e.getMessage());
            }
        }while(!oki);
    }
}

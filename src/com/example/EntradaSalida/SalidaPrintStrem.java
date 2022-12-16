package com.example.EntradaSalida;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SalidaPrintStrem {
    public static void main(String[] args) {
        //PrintStream generar datos apartir de algo
        try {
            PrintStream info = new PrintStream("copia.txt");
            info.println("Hola");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

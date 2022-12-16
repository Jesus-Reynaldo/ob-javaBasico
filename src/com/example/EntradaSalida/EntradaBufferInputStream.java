package com.example.EntradaSalida;

import java.io.*;
import java.util.Scanner;

public class EntradaBufferInputStream {
    public static void main(String[] args) {
        //Stream de fichero
        Scanner scanner = new Scanner(System.in);
        try {
            InputStream ficheros = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(ficheros);
            try {
                int dato = ficheroBuffer.read();
                while (dato!=-1){
                    System.out.println((char)dato);
                    dato = ficheroBuffer.read();
                }
            }catch (IOException e){
                System.out.println("No puedo leer el fichero: "+e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Oye, que el programa da error "+e.getClass());
        }
    }
}

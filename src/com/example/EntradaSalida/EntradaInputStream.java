package com.example.EntradaSalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EntradaInputStream {
    public static void main(String[] args) {
        //Stream de fichero
        try {
            InputStream ficheros = new FileInputStream("/etc/passwd");
            try {
                byte[] datos = ficheros.readAllBytes();
                for(byte dato : datos){
                    System.out.println((char)dato);
                }
            }catch (IOException e){
                System.out.println("No puedo leer el fichero: "+e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Oye, que el programa da error "+e.getClass());
        }
    }
}

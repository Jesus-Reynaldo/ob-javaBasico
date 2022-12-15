package com.example.tiposDatosAvanzados;

public class TipoString {
    public static void main(java.lang.String[] args) {
        java.lang.String cadena ="Mensaje de texto";
        int cadenaLen = cadena.length();
        System.out.println("La longitud ee un cadena es de: "+cadenaLen);
        java.lang.String cadenaMayus=cadena.toUpperCase();
        System.out.println("La cadena ahora es: "+cadenaMayus);
        java.lang.String cadenaMinus=cadena.toLowerCase();
        System.out.println("La cadena ahora es: "+cadenaMinus);
        //si una cadena comienza con los atributos mandados
        boolean resultado = cadena.startsWith("Men");// no es lo mismo las mayusculas y las minusculas
        if(resultado) {
            System.out.println("Empienza por lo que estoy buscando");
        }else {
            System.out.println("No empieza por lo que quiero");
        }
        //si una cadena termina con los atributos mandados
        boolean resultado2=cadena.endsWith("o");
        if(resultado2) {
            System.out.println("termina por lo que estoy buscando");
        }else {
            System.out.println("No termina por lo que quiero");
        }
        //caracter en una posicion de una cadena
        char letra=cadena.charAt(4);
        System.out.println("Caracter es: "+letra);
        //recorrer una cadena de texto
        for(int i=0;i<cadena.length();i++) {
            System.out.println("Caracter actual: "+cadena.charAt(i));
        }

    }
}

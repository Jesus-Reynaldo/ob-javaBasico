package com.example.estructurascontrol.condicionales;

public class CondicionIfElseIf {
    public static void main(String[] args) {
        String dia = "Dia";
        boolean resultado = dia.equals("Martes");
        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champions");
        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M de Me besas");
        } else if (dia.equals("Jueves")) {
            System.out.println("Ya es jueves");
        } else if (dia.equals("Viernes")) {
            System.out.println("Nos fuimos");
        } else if (dia.equals("Sabado")) {
            System.out.println("Nos morimos");
        } else if (dia.equals("Domingo")) {
            System.out.println("Depresion");
        }else{
            System.out.println("El dia introducido no es valido");
        }
    }
}

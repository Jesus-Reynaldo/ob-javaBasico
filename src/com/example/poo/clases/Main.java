package com.example.poo.clases;

import com.example.poo.herencia.Camion;
import com.example.poo.herencia.Coche;
import com.example.poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        //Clase identificador = nwe Clase():
        //crear un objeti utilizando el contructor vacio
        //Vehiculo toyotaPrius = new Vehiculo();
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
        //crear un objeto utlizando el constructor con parametros
        /*Vehiculo fordModeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
        System.out.println(fordModeo.fabricante);
        System.out.println(fordModeo.anio);
        System.out.println(fordModeo.velocidad);
        fordModeo.acelerar(50);
        System.out.println(fordModeo.velocidad);*/
        //Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";
        System.out.println("Fin de Programa");
        //Polimorfismo
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(60);

        vehiculo = new Camion();
        vehiculo.acelerar(80);
        //4. clases abstracion: no se pueden instanciar, solo instacian las clases hijas

    }
}

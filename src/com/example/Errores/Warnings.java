package com.example.Errores;

import java.util.HashMap;
import java.util.Map;

public class Warnings {
    public static void main(String[] args) {
        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("Clave1",10);
        mapa.put("Clave2",20);
        mapa.put("Clave3",30);
        mapa.replace("Clave4",190);//si no existe la clave lo ignora
        mapa.remove("clave2");
        System.out.println(mapa);
        System.out.println(mapa.get("Clave1"));
        mapa.replace("Clave3",90);
        for (Map.Entry<String, Integer> elemento:mapa.entrySet()){
            System.out.println("Elemento clave es: "+elemento.getKey());
            System.out.println("Elemento valor es: "+elemento.getValue());
        }
        demoMapa();
    }
    static void demoMapa(){

    }
}

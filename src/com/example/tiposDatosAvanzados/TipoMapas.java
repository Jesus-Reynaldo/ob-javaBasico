package com.example.tiposDatosAvanzados;

import java.util.HashMap;
import java.util.Map;

public class TipoMapas {
    public static void main(String[] args) {
        /**
         *  reciben muchos nombres mapas o array asociativos
         *  es diccionario cuyas claves puede ser cualquier tipo de dato
         *  no se puede tener la clave duplicada
         */
        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("Clave1",10);
        mapa.put("Clave2",20);
        mapa.put("Clave3",30);
        mapa.put("Clave3",40);
        mapa.replace("Clave4",190);//si no existe la clave lo ignora
        mapa.remove("clave2");
        System.out.println(mapa);
        System.out.println(mapa.get("Clave1"));
        mapa.replace("Clave3",90);
        for (Map.Entry elemento:mapa.entrySet()){
            System.out.println("Elemento clave es: "+elemento.getKey());
            System.out.println("Elemento valor es: "+elemento.getValue());
        }

    }
}

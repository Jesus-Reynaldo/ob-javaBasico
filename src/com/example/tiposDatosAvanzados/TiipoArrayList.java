package com.example.tiposDatosAvanzados;

import java.util.ArrayList;
import java.util.Objects;

public class TiipoArrayList {
    public static void main(String[] args) {
        //Capacidad Vector = capadidad Vector * 2
        //Capacidad ArrayList = Capacidad ArrayList + Capacidad ArrayList * 0.5
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemneto A");
        lista.add("Elemneto B");
        lista.add("Elemneto C");
        lista.remove("Elemneto B");
        System.out.println("Contenido: "+lista);
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        for(String s : lista){
            System.out.println(s);
        }
        String array[]= new String[lista.size()];
        for(int i = 0; i < array.length; i++){
            array[i] = lista.get(i);
        }
        for(String elemento:array) {
            System.out.println("Elemento es: " + elemento);
        }
        for(Object arrayObjecto:lista.toArray()){
            System.out.println(arrayObjecto.toString());
        }
    }
}

package com.example.tiposDatosAvanzados;


import java.util.Vector;

public class TipoVectores {
    public static void main(String[] args) {
        //los vectores a diferencia de los array no se les asigna un tamaño inicial o final
        //se ajustana al tamaño que tenemos
        Vector<Integer> vector = new Vector(16,10);
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("datos del vector: "+vector);
        vector.remove(2);
        System.out.println("datos del vector: "+vector);
        System.out.println("Vector tamaño: "+vector.size()+" y capacidad: "+vector.capacity());
        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);
        vector2.remove(1);

        //comparacion de vectores
        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales? "+resultado);
        vector.add(3);
        vector.add(4);
        for(int i:vector){
            System.out.println("Valor actual en vector: "+i);
        }
        for(int i=0;i<vector.size();i++){
            if(i%2==0){
                vector.remove(i);
                continue;
            }
            System.out.println("Valor es: "+vector.get(i)+" en posicion: "+i);
        }
        System.out.println("Vector tamaño: "+vector.size()+" y capacidad: "+vector.capacity());
        vector.trimToSize();
        System.out.println("Vector tamaño: "+vector.size()+" y capacidad: "+vector.capacity());
        //son array dimanicos
    }
}

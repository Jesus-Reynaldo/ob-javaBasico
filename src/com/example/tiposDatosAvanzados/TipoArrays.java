package com.example.tiposDatosAvanzados;

public class TipoArrays {
    public static void main(String[] args) {

        //se utiliza cuando no se sabe lo valores del array
        int[] arrayUno=new int[5];
        int arrayDos[]={1,2,3,4,5};
        for(int i:arrayDos){
            System.out.println(i);
        }
        String nombres[]={
                "pepe",
                "Juan",
                "Francisco"
        };
        for(String nombre:nombres){
            System.out.println("Nombre actual: "+nombre);
        }
        //forma concreta de recorrer un array
        String ultimoNombre="";
        for(int i=0;i<nombres.length;i++){
            //nos muestra su posicion
            System.out.println("Nombre actual: "+nombres[i]+"posicion "+i);
            ultimoNombre=nombres[i];
        }
        //Array y sus propiedades
        //.length es una propiedad en los array
        //.length() es un metodo en los String
        System.out.println("Longitud de array: "+nombres.length);
        int contador=0;
        while(contador<nombres.length){
            System.out.println("Nombre actual: "+nombres[contador]+"posicion "+contador);
            contador++;
        }
        /*int arrayBidi[][]=new int[2][4];
        arrayBidi[0][0]=1;
        arrayBidi[0][1]=2;
        arrayBidi[0][2]=3;
        arrayBidi[0][3]=4;
        arrayBidi[1][0]=10;
        arrayBidi[1][1]=20;
        arrayBidi[1][2]=30;
        arrayBidi[1][3]=40;*/
        int arrayBidi[][]={
                {1,2,3,4},
                {10,20,30,40}};
        for(int i=0;i<arrayBidi.length;i++){
            for(int j=0;j<arrayBidi[1].length;j++){
                System.out.println("Estoy en i = "+i+", j = "+j);
                System.out.println(arrayBidi[i][j]);
            }
        }
        String nombres1[]={"Pepe","Juan"};
        nombres1[0]="Victor";
        nombres1[1]="Paco";
        for(String nombre:nombres1){
            System.out.println(nombre);
        }
    }
}

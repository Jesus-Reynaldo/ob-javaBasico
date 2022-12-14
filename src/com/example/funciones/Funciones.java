package com.example;

public class Funciones {
    public static void main(String[] args) {


        //opcion 1: sin parametros y sin tipo de retorno
//        showMenu();
//        showMenu();
        showMenu();
        //opcion 2:Fucion sin parametros y con tipo de retorno
        String menu=getMenu();
        System.out.println(menu);
        System.out.println(getMenu());
        double price=getPrice();
        System.out.println(price);
        //opcion 3: Funcion con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootCamp");
        //opcion 4: funcion con parametros y con tipo de retorno
        String name="Jesus";
        String lastName="Campos";
        String saludo = obtenerSaludo(name,lastName);
        System.out.println(saludo);
        int resultadoSuma=suma(10,200);
        System.out.println(resultadoSuma);
    }

    static int suma(int numero1, int numero2) {
        return numero1+numero2;
    }

    private static String obtenerSaludo(String name, String lastName) {
        return "Buenas tardes "+name+" "+lastName;
    }

    static void imprimirSaludoBuenosDias(String name) {
        System.out.println("Buenas tardes "+name);
    }

    static double getPrice() {
        return 100.99;
    }

    static void showMenu(){
         System.out.println("Bienvenido al E-commerce de zapatillas:");
         System.out.println("1 - ver zapatillas");
         System.out.println("2 - Comprar zapatilla");
         System.out.println("3 - Salir");
     }
     static String getMenu(){
        return "Bienvenidos al E-commerce de zapatillas: \n 1 - Ver zapatillas...";
     }
}

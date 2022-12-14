package com.example.estructurascontrol.condicionales;

public class CondicionSwitch {
    public static void main(String[] args) {
        String dia = "Lunes";
        switch (dia) {
            case "Lunes":
                System.out.println("Hoy es lunes animo");
                break;
            case "Martes":
                System.out.println("Hoy es martes animo");
                break;
            case "Miercoles":
                System.out.println("Hoy es miercoles animo");
                break;
            case "Jueves":
                System.out.println("Hoy es jueves animo");
                break;
            case "Viernes":
                System.out.println("Hoy es viernes animo");
                break;
            case "Sabado":
                System.out.println("Hoy es sabado animo");
                break;
            case "Domingo":
                System.out.println("Hoy es domingo animo");
                break;
            default:
                System.out.println("No es un dia valido");
        }
    }
}

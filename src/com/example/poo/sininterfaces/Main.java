package com.example.poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();
        Empleado juan = new Empleado("Juan",26,45000,true);
        Empleado patricia = new Empleado("Patricia",26,45000,true);
        Empleado roberto = new Empleado("Roberto",26,45000,true);
        //guardar empleados
        empleadoCRUD.save(juan);
        empleadoCRUD.save(patricia);
        empleadoCRUD.save(roberto);
        //consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

    }
}

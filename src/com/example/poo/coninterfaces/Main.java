package com.example.poo.coninterfaces;

import com.example.poo.sininterfaces.Empleado;

public class Main {
    public static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUMySQL();
    public static void main(String[] args) {
        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}

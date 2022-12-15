package com.example.poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */
public class EmpleadoCRUDV1 {

    private List<Empleado> empleados = new ArrayList<>();

    //guardar un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }
    public List<Empleado> findAll(){
       return empleados;
    }
}

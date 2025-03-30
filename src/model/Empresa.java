package model;

import model.empleado.Empleado;
import model.empleado.Permanente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Empresa {

    private Set<Empleado> empleados = new HashSet<>();

    public Empresa() {}

    public Empresa(String nombre, String direccion, LocalDate fechaNacimiento) {

    }

    public void ejemplo() {

        List<Empleado> empleados = new ArrayList<>();

        Empleado empleado = new Permanente();

        empleados.add(empleado);
        empleados.add(empleado);


        Set<Empleado> empleadoSet = new HashSet<>();

        empleadoSet.add(empleado);
        empleados.add(empleado);


    }
}

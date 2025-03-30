package model;

import model.empleado.Empleado;
import model.empleado.Permanente;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Empresa {

    private String nombre;
    private String cuit;
    private Set<Empleado> empleados = new HashSet<>();
    private Set<ReciboHaber> reciboHaberes = new HashSet<>();

    public Empresa() {}

    public Empresa(String nombre, String cuit, Set<Empleado> empleados,Set<ReciboHaber> reciboHaberes) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = empleados;
        this.reciboHaberes = reciboHaberes;
    }




}

package model.empleado;


import model.Concepto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Contratado extends Empleado {
    private String numContrado;
    private String medioDePago;


    public Contratado() {}

    public Contratado(String nombre, String direccion, LocalDate fechaNacimiento, double sueldoBasico,
                      String estadoCivil, String numContrado, String medioDePago) {

        super(nombre,direccion,fechaNacimiento,sueldoBasico,estadoCivil );
        this.numContrado = numContrado;
        this.medioDePago = medioDePago;
    }

    @Override
    public double calcularBruto() {
        return getSueldoBasico();
    }

    @Override
    public double calcularRetenciones() {
        return 50;
    }

    @Override
    public Set<Concepto> conceptos() {

        Set<Concepto> conceptos = new HashSet<Concepto>();

        Concepto gastosAd = new Concepto("Gastos Administrativos", calcularRetenciones());

        conceptos.add(gastosAd);

        return conceptos;
    }
}

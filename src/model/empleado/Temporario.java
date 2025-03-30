package model.empleado;

import model.Concepto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Temporario extends Empleado {
    private LocalDate designacion;
    private int horasExtra;

    public Temporario() {}

    public Temporario(String nombre, String direccion, LocalDate fechaNacimiento, double sueldoBasico, String estadoCivil,
                      LocalDate designacion, int horasExtra) {
        super(nombre,direccion,fechaNacimiento,sueldoBasico,estadoCivil);
        this.designacion = designacion;
        this.horasExtra  = horasExtra;
    }

    public double calcularObraSocial(){

        if(calcularEdad() > 50) {
            return (calcularBruto() * 0.1) + 25;
        }
        else {return calcularBruto() * 0.1;
            }
    }

    public double calcularAportesJubilatorios(){

        return (calcularBruto() * 0.1) + (5 * horasExtra);
    }

    @Override
    public double calcularBruto() {
        return getSueldoBasico() + (40 * horasExtra);
    }

    @Override
    public double calcularRetenciones() {
        return 0;
    }

    @Override
    public Set<Concepto> conceptos() {

        Set<Concepto> conceptos = new HashSet<>();

        Concepto obraSocial = new Concepto("Obra Social", calcularObraSocial());

        Concepto jubilacion = new Concepto("Jubilacion", calcularAportesJubilatorios());

        conceptos.add(obraSocial);
        conceptos.add(jubilacion);

        return conceptos;
    }



}

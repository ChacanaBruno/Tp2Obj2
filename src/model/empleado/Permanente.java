package model.empleado;

import model.Concepto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Permanente extends Empleado {

    private int cantidadDeHijos;
    private int antiguedad;
    private boolean conyugue;

    public Permanente() {}

    public Permanente(String nombre, String direccion, LocalDate fechaNacimiento, double sueldoBasico,
                      String estadoCivil, int cantidadDeHijos, int antiguedad, boolean conyugue) {
        super(nombre,direccion,fechaNacimiento,sueldoBasico,estadoCivil);
        this.cantidadDeHijos = cantidadDeHijos;
        this.antiguedad = antiguedad;
        this.conyugue = conyugue;
    }


    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public double calcularBruto() {
        return getSueldoBasico() + calcularSalarioFamiliar();
    }

    @Override
    public double calcularRetenciones() {
        return calcularObraSocial() + calcularAportesJubilatorios();
    }


    public double calcularSalarioFamiliar() {
        if (conyugue) {
            return 100 + this.asignacionPorHijo() + this.asignacionPorAntiguedad();
        }
        else {
            return this.asignacionPorHijo() + this.asignacionPorAntiguedad();
        }
    }
    public double asignacionPorHijo() {
        return cantidadDeHijos * 150;
    }

    public double asignacionPorAntiguedad() {
        return antiguedad * 50;
    }

    public double calcularObraSocial() {
        double montoPorHijos   = cantidadDeHijos * 20;

        return getSueldoBasico() * 0.1 + montoPorHijos;
    }

    public double calcularAportesJubilatorios(){
        return 0.15 * calcularBruto();
    }



    public List<Concepto> indicarConceptos() {

        List<Concepto> conceptos = new ArrayList<>();

        Concepto salarioFamiliar = new Concepto("Salario Familiar", this.calcularSalarioFamiliar());

        //Concepto jubilacion = new Concepto("Jubilacion", this.calcularObraSocial());

        conceptos.add(salarioFamiliar);


        return conceptos;
    }
}


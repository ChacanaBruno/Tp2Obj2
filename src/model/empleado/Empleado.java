package model.empleado;

import model.Concepto;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public  abstract class Empleado {
    private String nombre;
    private String direccion;
    private LocalDate fechaNacimiento;
    private double sueldoBasico;
    private String estadoCivil;

    public Empleado() {

    }
    public Empleado(String nombre, String direccion, LocalDate fechaNacimiento, double sueldoBasico, String estadoCivil) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int calcularEdad(){
        //int añoNacimiento = this.getFechaNacimiento().getYear();
        //int añoActatual = LocalDate.now().getYear();
         return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public abstract double calcularBruto();

    public abstract double calcularRetenciones();

    public final double calcularNeto(){ // esto siempre se calcula asi
        return calcularBruto() - calcularRetenciones();
    }

    public double calcularObraSocial(){
        return 0.0;
    }

    public double calcularAportesJubilatorios(){
        return 0.0;
    }

    public Set<Concepto> conceptos(){
        Set<Concepto> conceptos = new HashSet();
        return  conceptos;
    }
}

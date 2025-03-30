package model;

import model.empleado.Empleado;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class ReciboHaber {

    private String nombre;
    private String direccion;
    private LocalDate fechaEmision;
    private double sueldoBruto;
    private double sueldoNeto;
    private Set<Concepto> desgloceDeConceptos;

    ReciboHaber(){}

    ReciboHaber(Empleado empleado){
        this.nombre = empleado.getNombre();
        this.direccion = empleado.getDireccion();
        this.fechaEmision = LocalDate.now();
        this.sueldoBruto = empleado.calcularBruto();
        this.sueldoNeto = empleado.calcularNeto();
        this.desgloceDeConceptos = empleado.conceptos();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Concepto> getDesgloceDeConceptos() {
        return desgloceDeConceptos;
    }

    public void setDesgloceDeConceptos(Set<Concepto> desgloceDeConceptos) {
        this.desgloceDeConceptos = desgloceDeConceptos;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }
}

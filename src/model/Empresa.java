package model;

import model.empleado.Empleado;
import java.util.HashSet;
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

    public double calcularTotalNetos() {

        double montoTotalNetos = 0.0;

        for (Empleado empleado : empleados) {
            montoTotalNetos = montoTotalNetos + empleado.calcularNeto();
        }

        return montoTotalNetos;
    }

    public  double calcularTotalBrutos() {

        return empleados.stream().mapToDouble(e -> e.calcularBruto()).sum();
    }

    /*cheaquar diferencias*/

    public  double calcularTotalRetenciones() {

        return empleados.stream().mapToDouble(Empleado::calcularRetenciones).sum();
    }

    public void liquidarSueldos() {
        for (Empleado empleado : empleados) {
            reciboHaberes.add(new ReciboHaber(empleado));
        }
    }

    //metodo solo para el script
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
}

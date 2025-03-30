package model.empleado;


public class Contratado extends Empleado {
    private String estadoCivil;
    private String numContrado;
    private String medioDePago;


    public Contratado() {}

    public Contratado(String nombre, String apellido, int edad, String estadoCivil, String numContrado) {
        super(nombre,apellido,edad, );
    }

    @Override
    public double calcularBruto() {
        return 0;
    }

    @Override
    public double calcularRetenciones() {
        return 0;
    }

}

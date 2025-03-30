package model.script;

import model.Empresa;
import model.ReciboHaber;
import model.empleado.Contratado;
import model.empleado.Empleado;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Script {


   public Script() {
       Contratado contratado = new Contratado("pepe","calle 1", LocalDate.now(),100,
               "Soltero", "178","Efectivo");

       Set<Empleado> empleados = new HashSet<Empleado>();

       Set<ReciboHaber> reciboHaberes = new HashSet<ReciboHaber>();

       Empresa jacaCorp= new Empresa("JacaCorp", "20-555-4", empleados, reciboHaberes);

       jacaCorp.registrarEmpleado(contratado);

       jacaCorp.calcularTotalBrutos();

       jacaCorp.liquidarSueldos();
   }
}

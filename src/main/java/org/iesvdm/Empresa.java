package org.iesvdm;


import org.iesvdm.anotations.Empleado;
import org.iesvdm.anotations.Empleados;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

@Empleado(nombre = "Jose Manuel", apellidos = "Martín Tejero", dni = "11111111A", direccion = "ies Vega de Mijas", telefono = "666666666", clase = "DAW", codigoDespacho = "1")
@Empleado(nombre = "Hector", apellidos = "Lopez Diaz", dni = "22222222B", direccion = "FuengiMola", telefono = "677777777", clase = "DAW2", codigoDespacho = "2")
@Empleado(nombre = "Guille", apellidos = "Moreno", dni = "33333333C", direccion = "Mijas", telefono = "688888888", clase = "DAW2", codigoDespacho = "3")
@Empleado(nombre = "Carmen", apellidos = "Martín Romo", dni = "44444444D", direccion = "La Union", telefono = "699999999", clase = "DAW2", codigoDespacho = "4")
@Empleado(nombre = "Michelle", apellidos = "Albacura", dni = "55555555E", direccion = "Las Lagunas", telefono = "644444444", clase = "DAW2", codigoDespacho = "5")
@Empleado(nombre = "Mireya", apellidos = "Medalle", dni = "66666666F", direccion = "Las Lagunas", telefono = "655555555", clase = "DAW2", codigoDespacho = "6")

public class Empresa {

    // Se le pasa el tipo al Set de la clase Empleado, no de la Anotacion:
     public Set<org.iesvdm.Empleado> empleadoSet = new HashSet<>();

    public Empresa(){
        
    }

    public Set<org.iesvdm.Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    public static void cargadorDeContexto(Empresa empresitaNueva){

        // empresitaNueva.getClass().getAnnotation(Empleados.class);
        // ESTE NO, QUEREMOS UNO QUE DEVUELVA VARIAS ANOTACIONES DE EMPLEADO:

        Annotation[] anotaciones = empresitaNueva.getClass().getAnnotations();

        for (Annotation annotation : anotaciones) {
            if(annotation instanceof org.iesvdm.anotations.Empleados){
                System.out.println(annotation);

                Empleado[] empleadosAnotArrray = ((Empleados) annotation).value();

                String nombre = ((org.iesvdm.anotations.Empleado) annotation).nombre();

                empresitaNueva.getEmpleadoSet().add(new org.iesvdm.Empleado(nombre));
            }
        }
    }
}

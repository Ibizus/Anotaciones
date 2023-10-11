package org.iesvdm;


import org.iesvdm.anotations.EmpleadoAnot;
import org.iesvdm.anotations.EmpleadosAnot;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

@EmpleadoAnot(nombre = "Jose Manuel", apellidos = "Martín Tejero", dni = "11111111A", direccion = "ies Vega de Mijas", telefono = "666666666", clase = "Directivo", codigoDespacho = 101)
@EmpleadoAnot(nombre = "Hector", apellidos = "Lopez Diaz", dni = "22222222B", direccion = "Fuengirola", telefono = "677777777", clase = "Oficial", categoria = "segunda")
@EmpleadoAnot(nombre = "Guille", apellidos = "Moreno", dni = "33333333C", direccion = "Mijas", telefono = "688888888", clase = "Tecnico", perfil = "IT", codigoTaller = 1)
@EmpleadoAnot(nombre = "Carmen", apellidos = "Martín Romo", dni = "44444444D", direccion = "La Union", telefono = "699999999", clase = "Tecnico", perfil = "IT", codigoTaller = 2)
@EmpleadoAnot(nombre = "Michelle", apellidos = "Albacura", dni = "55555555E", direccion = "Las Lagunas", telefono = "644444444", clase = "Tecnico", perfil = "IT", codigoTaller = 3)
@EmpleadoAnot(nombre = "Mireya", apellidos = "Medalle", dni = "66666666F", direccion = "Las Lagunas", telefono = "655555555", clase = "Oficial", categoria = "segunda")

public class Empresa {

    // ATTRIBUTES:
    // Se le pasa el tipo al Set de la clase Empleado, no de la Anotacion:
     public Set<Empleado> empleadoSet = new HashSet<>();

     // CONSTRUCTOR:
    public Empresa(){
        
    }

    // GETTER:
    public Set<Empleado> getEmpleadoSet() {
        return empleadoSet;
    }
}

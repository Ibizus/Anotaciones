package org.iesvdm.anotations;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(org.iesvdm.anotations.Empleados.class)
public @interface Empleado {

    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String clase();
    String codigoDespacho();

}

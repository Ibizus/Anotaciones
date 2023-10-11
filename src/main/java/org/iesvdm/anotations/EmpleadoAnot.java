package org.iesvdm.anotations;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(EmpleadosAnot.class)
public @interface EmpleadoAnot {

    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String clase();
    int codigoTaller() default 0;
    String perfil() default "void";
    String categoria() default "void";
    int codigoDespacho() default 0;

}

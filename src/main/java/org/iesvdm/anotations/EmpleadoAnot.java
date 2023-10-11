package org.iesvdm.anotations;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(EmpleadosAnot.class)
public @interface EmpleadoAnot {

    // Aquí si vamos a marcar todos los atributos posibles que puedan tener
    // las instancias hijas de la clase "empleado", para los atributos que NO van en
    // todas las clases ponemos un valor default y así no se queja el constructor de la anotación
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

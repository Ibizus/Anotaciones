package org.iesvdm.utils;

import org.iesvdm.*;
import org.iesvdm.anotations.EmpleadoAnot;
import org.iesvdm.anotations.EmpleadosAnot;

import java.lang.annotation.Annotation;

public class Contexto {


    public static void cargadorDeContexto(Empresa nuevaEmpresa){

        EmpleadosAnot empleadosAnotPadre = nuevaEmpresa.getClass().getAnnotation(EmpleadosAnot.class);
        EmpleadoAnot[] empleadoAnotHijos = empleadosAnotPadre.value();

        // ITERO PARA CARGAR LAS ANOTACIONES E INSTANCIAR LOS EMPLEADOS SEGUN SU CLASE Y AÑADIRLOS A LA EMPRESA
        for (EmpleadoAnot anotHijo: empleadoAnotHijos) {

            // Atributos comunes del padre:
            String nombre = anotHijo.nombre();
            String apellidos = anotHijo.apellidos();
            String direccion = anotHijo.direccion();
            String dni = anotHijo.dni();
            String telefono = anotHijo.telefono();

            if(anotHijo.clase().equals("Tecnico")){

                // Atributos de la clase:
                int codigoTaller = anotHijo.codigoTaller();
                String perfil = anotHijo.perfil();

                nuevaEmpresa.getEmpleadoSet().add(new Tecnico(nombre, apellidos, direccion, dni, telefono, codigoTaller, perfil));


            } else if (anotHijo.clase().equals("Oficial")) {

                // Atributos de la clase:
                int codigoTaller = anotHijo.codigoTaller();
                String categoria = anotHijo.categoria();

                nuevaEmpresa.getEmpleadoSet().add(new Oficial(nombre, apellidos, direccion, dni, telefono, codigoTaller, categoria));

            } else if (anotHijo.clase().equals("Directivo")) {

                // Atributos de la clase:
                int codigoDespacho = anotHijo.codigoDespacho();

                nuevaEmpresa.getEmpleadoSet().add(new Directivo(nombre, apellidos, direccion, dni, telefono, codigoDespacho));
            }
        }

    }
}

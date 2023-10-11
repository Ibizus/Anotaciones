package org.iesvdm;

import org.iesvdm.utils.Contexto;

public class Main {
    public static void main(String[] args) {

        Empresa empresitaNueva = new Empresa();
        Contexto.cargadorDeContexto(empresitaNueva);

        // ITERO SOBRE EL SET DE EMPLEADOS PARA COMPROBAR QUE SE HA CARGADO EL CONTEXTO CORRECTAMENTE:
        for (Empleado trabajador: empresitaNueva.getEmpleadoSet()){

            System.out.println(trabajador);
        }
    }
}
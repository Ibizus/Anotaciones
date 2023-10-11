package org.iesvdm;

import org.iesvdm.utils.Contexto;

public class Main {
    public static void main(String[] args) {

        Empresa empresitaNueva = new Empresa();

        Contexto.cargadorDeContexto(empresitaNueva);

        // ITERO PARA COMPROBAR QUE SE HA CARGADO EL CONTEXO CORRECTAMENTE:
    }
}
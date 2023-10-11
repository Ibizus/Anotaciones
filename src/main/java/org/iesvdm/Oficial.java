package org.iesvdm;

public class Oficial extends Operario{


    // ATTRIBUTES:
    private String categoria;

    // CONSTRUCTOR:
    public Oficial(String nombre, String apellidos, String direccion, String dni, String telefono, Integer codigoTaller, String categoria) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
        this.categoria = categoria;
    }

    // GETTERS & SETTERS:
    public String getCategoria() {
        return categoria;
    }
}

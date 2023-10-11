package org.iesvdm;

public class Directivo extends Empleado{

    // ATTRIBUTES:
    private Integer codigoDespacho;

    // CONSTRUCTOR:
    public Directivo(String nombre, String apellidos, String direccion, String dni, String telefono, Integer codigoDespacho){
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoDespacho = codigoDespacho;
    }

    // GETTERS:
    public Integer getCodigoDespacho() {
        return codigoDespacho;
    }
}

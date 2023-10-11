package org.iesvdm;

public abstract class Operario extends Empleado{

    // ATTRIBUTES:
    protected Integer codigoTaller;

    // CONSTRUCTOR:
    public Operario(String nombre, String apellidos, String direccion, String dni, String telefono, Integer codigoTaller){
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoTaller = codigoTaller;
    }

    // GETTER:
    public Integer getCodigoTaller() {
        return codigoTaller;
    }
}

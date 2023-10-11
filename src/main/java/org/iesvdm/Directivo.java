package org.iesvdm;

public class Directivo extends Empleado{

    // ATTRIBUTES:
    private Integer codigoDespacho;

    // CONSTRUCTOR:
    public Directivo(String nombre, String apellidos, String direccion, String dni, String telefono, Integer codigoDespacho){
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoDespacho = codigoDespacho;
    }

    // METHODS:
    @Override
    public String toString() {
        return "Directivo {" +
                super.toString() +
                "codigoDespacho=" + codigoDespacho +
                '}';
    }

    // GETTERS:
    public Integer getCodigoDespacho() {
        return codigoDespacho;
    }
}

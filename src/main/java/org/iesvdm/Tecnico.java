package org.iesvdm;

public class Tecnico extends Operario{


    // ATTRIBUTES:
    private String perfil;

    // CONSTRUCTOR:
    public Tecnico(String nombre, String apellidos, String direccion, String dni, String telefono, Integer codigoTaller, String perfil) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
        this.perfil = perfil;
    }

    // GETTERS & SETTERS:
    public String getPerfil() {
        return perfil;
    }
}

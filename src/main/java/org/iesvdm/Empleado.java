package org.iesvdm;

import java.util.Objects;

// En la clase "empleado" van solo los atributos que realmente queremos que tenga la clase instanciada (sus hijas)
public abstract class Empleado {

    // ATTRIBUTES:
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected String dni;
    protected String telefono;

    // CONSTRUCTOR:
    public Empleado(String nombre, String apellidos, String direccion, String dni, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }

    // METHODS:
    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono + " ";
    }

    // Al utilizar un set es necesario hacer el override de equals y hashCode
    // (en este caso hago la comprobación por dni y nombre)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) && Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }


    // GETTERS & SETTERS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

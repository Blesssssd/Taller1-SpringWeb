package com.taller.taller1.models;

public class Estudiante {

    private int codigo;
    private String nombre;
    private String apellido;
    private String documento;
    private int edad;
    private String telefono;
    private String email;
    private String direccion;
    private String asignatura;
    

    public Estudiante() {
    }

    public Estudiante(int codigo, String nombre, String apellido, String documento, int edad, String telefono,
            String email, String direccion, String asignatura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.asignatura = asignatura;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}

package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {

    private String nombre; // Nombre completo del beneficiario
    private int edad; // Edad del beneficiario
    private String sexo; // Sexo del beneficiario
    private String relacionConPaciente; // Relación con el paciente (ej. hijo, esposa, etc.)
    private String direccion; // Dirección de residencia
    private String telefono; // Teléfono de contacto
    private String correoElectronico; // Correo electrónico
    private String documentosNecesarios; // Documentos necesarios para el beneficiario
    private LocalDate fechaIngreso; // Fecha de ingreso al sistema
    private String observaciones; // Observaciones adicionales

    public Beneficiario() {
    }

    public Beneficiario(String nombre, int edad, String sexo, String relacionConPaciente, String direccion, String telefono, String correoElectronico, String documentosNecesarios, LocalDate fechaIngreso, String observaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.relacionConPaciente = relacionConPaciente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.documentosNecesarios = documentosNecesarios;
        this.fechaIngreso = fechaIngreso;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRelacionConPaciente() {
        return relacionConPaciente;
    }

    public void setRelacionConPaciente(String relacionConPaciente) {
        this.relacionConPaciente = relacionConPaciente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDocumentosNecesarios() {
        return documentosNecesarios;
    }

    public void setDocumentosNecesarios(String documentosNecesarios) {
        this.documentosNecesarios = documentosNecesarios;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", relacionConPaciente='" + relacionConPaciente + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", documentosNecesarios='" + documentosNecesarios + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}






package org.example.MODELOS;

import java.time.LocalDate;

public class Asegurado {


        private String nombre;
        private int edad;
        private String sexo;
        private String numeroDePoliza;
        private String tipoDeSeguro;
        private String direccion;
        private String telefono;
        private String correoElectronico;
        private LocalDate fechaInicioCobertura;
        private LocalDate fechaFinCobertura;
        private String documentosAdjuntos;
        private String observaciones;

        // Constructor


    public Asegurado() {
    }

    public Asegurado(String nombre, int edad, String sexo, String numeroDePoliza,
                     String tipoDeSeguro, String direccion, String telefono,
                     String correoElectronico, LocalDate fechaInicioCobertura,
                     LocalDate fechaFinCobertura, String documentosAdjuntos,
                     String observaciones) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.numeroDePoliza = numeroDePoliza;
            this.tipoDeSeguro = tipoDeSeguro;
            this.direccion = direccion;
            this.telefono = telefono;
            this.correoElectronico = correoElectronico;
            this.fechaInicioCobertura = fechaInicioCobertura;
            this.fechaFinCobertura = fechaFinCobertura;
            this.documentosAdjuntos = documentosAdjuntos;
            this.observaciones = observaciones;
        }

        // Getters y Setters
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

        public String getNumeroDePoliza() {
            return numeroDePoliza;
        }

        public void setNumeroDePoliza(String numeroDePoliza) {
            this.numeroDePoliza = numeroDePoliza;
        }

        public String getTipoDeSeguro() {
            return tipoDeSeguro;
        }

        public void setTipoDeSeguro(String tipoDeSeguro) {
            this.tipoDeSeguro = tipoDeSeguro;
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

        public LocalDate getFechaInicioCobertura() {
            return fechaInicioCobertura;
        }

        public void setFechaInicioCobertura(LocalDate fechaInicioCobertura) {
            this.fechaInicioCobertura = fechaInicioCobertura;
        }

        public LocalDate getFechaFinCobertura() {
            return fechaFinCobertura;
        }

        public void setFechaFinCobertura(LocalDate fechaFinCobertura) {
            this.fechaFinCobertura = fechaFinCobertura;
        }

        public String getDocumentosAdjuntos() {
            return documentosAdjuntos;
        }

        public void setDocumentosAdjuntos(String documentosAdjuntos) {
            this.documentosAdjuntos = documentosAdjuntos;
        }

        public String getObservaciones() {
            return observaciones;
        }

        public void setObservaciones(String observaciones) {
            this.observaciones = observaciones;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Asegurado: ").append(nombre).append("\n")
                    .append("Edad: ").append(edad).append("\n")
                    .append("Sexo: ").append(sexo).append("\n")
                    .append("Número de Póliza: ").append(numeroDePoliza).append("\n")
                    .append("Tipo de Seguro: ").append(tipoDeSeguro).append("\n")
                    .append("Dirección: ").append(direccion).append("\n")
                    .append("Teléfono: ").append(telefono).append("\n")
                    .append("Correo Electrónico: ").append(correoElectronico).append("\n")
                    .append("Fecha de Inicio de Cobertura: ").append(fechaInicioCobertura).append("\n")
                    .append("Fecha de Fin de Cobertura: ").append(fechaFinCobertura).append("\n")
                    .append("Documentos Adjuntos: ").append(String.join(", ", documentosAdjuntos)).append("\n")
                    .append("Observaciones: ").append(observaciones);
            return sb.toString();
        }
    }



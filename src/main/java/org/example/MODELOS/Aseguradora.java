package org.example.MODELOS;

import java.time.LocalDate;

public class Aseguradora {


        private String nombre; // Nombre de la aseguradora
        private String direccion; // Dirección de la aseguradora
        private String telefono; // Teléfono de contacto
        private String correoElectronico; // Correo electrónico
        private String tipoCobertura; // Tipo de cobertura ofrecida
        private double costoMensual; // Costo mensual del seguro
        private LocalDate fechaInicioCobertura; // Fecha de inicio de la cobertura
        private LocalDate fechaFinCobertura; // Fecha de fin de la cobertura
        private String condiciones; // Condiciones del contrato
        private String documentosRequeridos; // Documentos requeridos para la afiliación
        private String observaciones; // Observaciones adicionales

        // Constructor


    public Aseguradora() {
    }

    public Aseguradora(String nombre, String direccion, String telefono, String correoElectronico,
                       String tipoCobertura, double costoMensual, LocalDate fechaInicioCobertura,
                       LocalDate fechaFinCobertura, String condiciones, String documentosRequeridos,
                       String observaciones) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.correoElectronico = correoElectronico;
            this.tipoCobertura = tipoCobertura;
            this.costoMensual = costoMensual;
            this.fechaInicioCobertura = fechaInicioCobertura;
            this.fechaFinCobertura = fechaFinCobertura;
            this.condiciones = condiciones;
            this.documentosRequeridos = documentosRequeridos;
            this.observaciones = observaciones;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
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

        public String getTipoCobertura() {
            return tipoCobertura;
        }

        public void setTipoCobertura(String tipoCobertura) {
            this.tipoCobertura = tipoCobertura;
        }

        public double getCostoMensual() {
            return costoMensual;
        }

        public void setCostoMensual(double costoMensual) {
            this.costoMensual = costoMensual;
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

        public String getCondiciones() {
            return condiciones;
        }

        public void setCondiciones(String condiciones) {
            this.condiciones = condiciones;
        }

        public String getDocumentosRequeridos() {
            return documentosRequeridos;
        }

        public void setDocumentosRequeridos(String documentosRequeridos) {
            this.documentosRequeridos = documentosRequeridos;
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
            sb.append("Aseguradora: ").append(nombre).append("\n")
                    .append("Dirección: ").append(direccion).append("\n")
                    .append("Teléfono: ").append(telefono).append("\n")
                    .append("Correo Electrónico: ").append(correoElectronico).append("\n")
                    .append("Tipo de Cobertura: ").append(tipoCobertura).append("\n")
                    .append("Costo Mensual: $").append(costoMensual).append("\n")
                    .append("Fecha de Inicio de Cobertura: ").append(fechaInicioCobertura).append("\n")
                    .append("Fecha de Fin de Cobertura: ").append(fechaFinCobertura).append("\n")
                    .append("Condiciones: ").append(condiciones).append("\n")
                    .append("Documentos Requeridos: ").append(String.join(", ", documentosRequeridos)).append("\n")
                    .append("Observaciones: ").append(observaciones);
            return sb.toString();
        }
    }



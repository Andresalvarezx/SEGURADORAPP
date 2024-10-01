package org.example.MODELOS;

public class Vehiculo {


        private String marca; // Marca del vehículo
        private String modelo; // Modelo del vehículo
        private int anio; // Año de fabricación
        private String color; // Color del vehículo
        private String numeroDePlaca; // Número de placa
        private String tipo; // Tipo de vehículo (ej. sedan, SUV, etc.)
        private String vin; // Número de identificación del vehículo (VIN)
        private double kilometraje; // Kilometraje del vehículo
        private String estado; // Estado del vehículo (ej. nuevo, usado)
        private String propietario; // Nombre del propietario del vehículo
        private String serviciosRealizados; // Servicios realizados al vehículo
        private String observaciones; // Observaciones adicionales

        // Constructor


    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String color, String numeroDePlaca,
                    String tipo, String vin, double kilometraje, String estado,
                    String propietario, String serviciosRealizados, String observaciones) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.color = color;
            this.numeroDePlaca = numeroDePlaca;
            this.tipo = tipo;
            this.vin = vin;
            this.kilometraje = kilometraje;
            this.estado = estado;
            this.propietario = propietario;
            this.serviciosRealizados = serviciosRealizados;
            this.observaciones = observaciones;
        }

        // Getters y Setters
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getNumeroDePlaca() {
            return numeroDePlaca;
        }

        public void setNumeroDePlaca(String numeroDePlaca) {
            this.numeroDePlaca = numeroDePlaca;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getVin() {
            return vin;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }

        public double getKilometraje() {
            return kilometraje;
        }

        public void setKilometraje(double kilometraje) {
            this.kilometraje = kilometraje;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getPropietario() {
            return propietario;
        }

        public void setPropietario(String propietario) {
            this.propietario = propietario;
        }

        public String getServiciosRealizados() {
            return serviciosRealizados;
        }

        public void setServiciosRealizados(String serviciosRealizados) {
            this.serviciosRealizados = serviciosRealizados;
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
            sb.append("Marca: ").append(marca).append("\n")
                    .append("Modelo: ").append(modelo).append("\n")
                    .append("Año: ").append(anio).append("\n")
                    .append("Color: ").append(color).append("\n")
                    .append("Número de Placa: ").append(numeroDePlaca).append("\n")
                    .append("Tipo: ").append(tipo).append("\n")
                    .append("VIN: ").append(vin).append("\n")
                    .append("Kilometraje: ").append(kilometraje).append(" km\n")
                    .append("Estado: ").append(estado).append("\n")
                    .append("Propietario: ").append(propietario).append("\n")
                    .append("Servicios Realizados: ").append(String.join(", ", serviciosRealizados)).append("\n")
                    .append("Observaciones: ").append(observaciones);
            return sb.toString();
        }
    }



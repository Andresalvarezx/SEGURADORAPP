package org.example.MODELOS;

import java.time.LocalDate;

public class Accidente {


        private String descripcion; // Descripción del accidente
        private LocalDate fecha; // Fecha del accidente
        private String ubicacion; // Ubicación del accidente
        private String personasInvolucradas; // Personas involucradas en el accidente
        private String testigos; // Testigos del accidente
        private String consecuencias; // Consecuencias del accidente
        private String documentosAdjuntos; // Documentos relacionados con el accidente
        private String observaciones; // Observaciones adicionales

        // Constructor


    public Accidente() {
    }

    public Accidente(String descripcion, LocalDate fecha, String ubicacion,
                     String personasInvolucradas, String testigos,
                     String consecuencias, String documentosAdjuntos,
                     String observaciones) {
            this.descripcion = descripcion;
            this.fecha = fecha;
            this.ubicacion = ubicacion;
            this.personasInvolucradas = personasInvolucradas;
            this.testigos = testigos;
            this.consecuencias = consecuencias;
            this.documentosAdjuntos = documentosAdjuntos;
            this.observaciones = observaciones;
        }

        // Getters y Setters
        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public LocalDate getFecha() {
            return fecha;
        }

        public void setFecha(LocalDate fecha) {
            this.fecha = fecha;
        }

        public String getUbicacion() {
            return ubicacion;
        }

        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }

        public String getPersonasInvolucradas() {
            return personasInvolucradas;
        }

        public void setPersonasInvolucradas(String personasInvolucradas) {
            this.personasInvolucradas = personasInvolucradas;
        }

        public String getTestigos() {
            return testigos;
        }

        public void setTestigos(String testigos) {
            this.testigos = testigos;
        }

        public String getConsecuencias() {
            return consecuencias;
        }

        public void setConsecuencias(String consecuencias) {
            this.consecuencias = consecuencias;
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
            sb.append("Descripción del Accidente: ").append(descripcion).append("\n")
                    .append("Fecha: ").append(fecha).append("\n")
                    .append("Ubicación: ").append(ubicacion).append("\n")
                    .append("Personas Involucradas: ").append(String.join(", ", personasInvolucradas)).append("\n")
                    .append("Testigos: ").append(String.join(", ", testigos)).append("\n")
                    .append("Consecuencias: ").append(consecuencias).append("\n")
                    .append("Documentos Adjuntos: ").append(String.join(", ", documentosAdjuntos)).append("\n")
                    .append("Observaciones: ").append(observaciones);
            return sb.toString();
        }
    }



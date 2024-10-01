package org.example;

import org.example.MODELOS.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Asegurado aseguradoUno=new Asegurado();

        Asegurado aseguradoDos=new Asegurado("juan",18,"masculino","10203239","vida","carrera30csur","3029754","juan400x@gmail.com", LocalDate.now(),LocalDate.now(),"si","accidentado");

        Vehiculo vehiculoUno=new Vehiculo();

        Vehiculo vehiculoDos=new Vehiculo("renault","2020",2021,"gris","BAC123","camioneta","si",10.000,"perdidaTotal","juan","mantenimiento","esta en la estado");

        Accidente AccidenteUno=new Accidente();

        Accidente accidenteDos=new Accidente("fue contra un bus",LocalDate.now(),"poblado","conductor y pasajero","personas que estaban en la via","daño de los carros","si","los carros fueron dañados");

        Aseguradora aseguradoraUno=new Aseguradora();

        Aseguradora aseguradoraDos=new Aseguradora("SURA","57cnorte33","320323023","sura@gmail.com","telefonica",200.000,LocalDate.now(),LocalDate.now(),"contra todo","presentados","se responde");

        Beneficiario beneficiarioUno=new Beneficiario();

        Beneficiario beneficiarioDos=new Beneficiario("camilo",18,"masculino","hermano","39csur33","3029754","camilo400x@gmail.com","presentados",LocalDate.now(),"se responde");

        System.out.println(aseguradoUno);

        System.out.println(aseguradoDos);

        System.out.println(vehiculoUno);

        System.out.println(vehiculoDos);

        System.out.println(AccidenteUno);

        System.out.println(accidenteDos);

        System.out.println(aseguradoraUno);

        System.out.println(aseguradoraDos);

        System.out.println(beneficiarioUno);

        System.out.println(beneficiarioDos);

       Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese los datos del asegurado:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Número de Póliza: ");
        String numeroDePoliza = scanner.nextLine();
        System.out.print("Tipo de Seguro: ");
        String tipoDeSeguro = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Fecha de Inicio de Cobertura (YYYY-MM-DD): ");
        LocalDate fechaInicioCobertura = LocalDate.parse(scanner.nextLine());
        System.out.print("Fecha de Fin de Cobertura (YYYY-MM-DD): ");
        LocalDate fechaFinCobertura = LocalDate.parse(scanner.nextLine());
        System.out.print("Documentos Adjuntos: ");
        String documentosAdjuntos = scanner.nextLine();
        System.out.print("Observaciones: ");
        String observaciones = scanner.nextLine();

        System.out.println("Ingrese los datos del vehículo:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Año: ");
        int anio = Integer.parseInt(scanner.nextLine());
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Número de Placa: ");
        String numeroDePlaca = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("VIN: ");
        String vin = scanner.nextLine();
        System.out.print("Kilometraje: ");
        double kilometraje = Double.parseDouble(scanner.nextLine());
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("Propietario: ");
        String propietario = scanner.nextLine();
        System.out.print("Servicios Realizados (separados por comas): ");
        String serviciosRealizados = scanner.nextLine();
        System.out.print("Observaciones: ");
        String observacione = scanner.nextLine();

        System.out.println("Ingrese los datos del accidente:");
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Fecha (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());
        System.out.print("Ubicación: ");
        String ubicacion = scanner.nextLine();
        System.out.print("Personas Involucradas (separadas por comas): ");
        String personasInvolucradas = scanner.nextLine();
        System.out.print("Testigos (separados por comas): ");
        String testigos = scanner.nextLine();
        System.out.print("Consecuencias: ");
        String consecuencias = scanner.nextLine();
        System.out.print("Documentos Adjuntos (separados por comas): ");
        String documentosAdjunto = scanner.nextLine();
        System.out.print("Observaciones: ");
        String observacionesa = scanner.nextLine();

        System.out.println("Ingrese los datos de la aseguradora:");
        System.out.print("Nombre: ");
        String nombrea = scanner.nextLine();
        System.out.print("Dirección: ");
        String direcciona = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoa = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoElectronicoa = scanner.nextLine();
        System.out.print("Tipo de Cobertura: ");
        String tipoCobertura = scanner.nextLine();
        System.out.print("Costo Mensual: ");
        double costoMensual = scanner.nextDouble();
        scanner.nextLine();  // Consumir la nueva línea
        System.out.print("Fecha de Inicio de Cobertura (YYYY-MM-DD): ");
        LocalDate fechaInicioCoberturaa = LocalDate.parse(scanner.nextLine());
        System.out.print("Fecha de Fin de Cobertura (YYYY-MM-DD): ");
        LocalDate fechaFinCoberturaa = LocalDate.parse(scanner.nextLine());
        System.out.print("Condiciones: ");
        String condiciones = scanner.nextLine();
        System.out.print("Documentos Requeridos (separados por comas): ");
        String documentosRequeridos = scanner.nextLine();
        System.out.print("Observaciones: ");
        String observacionesb = scanner.nextLine();

        System.out.println("Ingrese los datos del beneficiario:");
        System.out.print("Nombre: ");
        String nombreb = scanner.nextLine();
        System.out.print("Edad: ");
        int edadb = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea
        System.out.print("Sexo: ");
        String sexob = scanner.nextLine();
        System.out.print("Relación con el Paciente: ");
        String relacionConPaciente = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionb = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonob = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoElectronicob = scanner.nextLine();
        System.out.print("Documentos Necesarios: ");
        String documentosNecesarios = scanner.nextLine();
        System.out.print("Fecha de Ingreso (YYYY-MM-DD): ");
        LocalDate fechaIngreso = LocalDate.parse(scanner.nextLine());
        System.out.print("Observaciones: ");
        String observacionesc = scanner.nextLine();


    }
}
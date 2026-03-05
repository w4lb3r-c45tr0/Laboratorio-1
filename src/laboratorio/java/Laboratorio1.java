package laboratorio.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laboratorio1 {

    // 🔹 Variables globales
    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    calcularPromedio();
                    break;
                case 4:
                    mostrarMayorCalificacion();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }

    // 🔹 Método para mostrar menú
    public static void mostrarMenu() {
        System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio");
        System.out.println("4. Mostrar estudiante(s) con la calificación más alta");
        System.out.println("5. Salir");
    }

    // 🔹 Método para agregar estudiante
    public static void agregarEstudiante() {

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        double calificacion = leerDouble("Ingrese la calificación (0-100): ");

        if (calificacion >= 0 && calificacion <= 100) {
            estudiantes.add(nombre);
            calificaciones.add(calificacion);
            System.out.println("Estudiante agregado correctamente.");
        } else {
            System.out.println("La calificación debe estar entre 0 y 100.");
        }
    }

    // 🔹 Método para mostrar estudiantes
    public static void mostrarEstudiantes() {

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\nLista de estudiantes:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i) +
                    " - Calificación: " + calificaciones.get(i));
        }
    }

    // 🔹 Método para calcular promedio
    public static void calcularPromedio() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
            return;
        }

        double suma = 0;

        for (double nota : calificaciones) {
            suma += nota;
        }

        double promedio = suma / calificaciones.size();

        System.out.println("El promedio de calificaciones es: " + promedio);
    }

    // 🔹 Método actualizado para mostrar todos los estudiantes con nota máxima
    public static void mostrarMayorCalificacion() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
            return;
        }

        double maxCalificacion = calificaciones.get(0);

        // Paso 1: Encontrar la nota máxima
        for (double nota : calificaciones) {
            if (nota > maxCalificacion) {
                maxCalificacion = nota;
            }
        }

        // Paso 2: Mostrar todos los estudiantes con esa nota
        System.out.println("Estudiante(s) con la calificación más alta (" 
                + maxCalificacion + "):");

        for (int i = 0; i < calificaciones.size(); i++) {
            if (calificaciones.get(i) == maxCalificacion) {
                System.out.println("- " + estudiantes.get(i));
            }
        }
    }

    // 🔹 Método para leer entero con validación
    public static int leerEntero(String mensaje) {

        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }
    }

    // 🔹 Método para leer double con validación
    public static double leerDouble(String mensaje) {

        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }
    }


	}



package com.devtalles.project.junior_primer_nivel.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void calculadoraHorasTrabajadas() {

        Scanner sc = new Scanner(System.in);

        double horaNormal = 4800;
        double horaExtra = horaNormal * 1.5;

        double horaNocturnaNormal = horaNormal * 1.20;
        double horaExtraNocturna = horaExtra * 1.20;

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el turno trabajado:");
        System.out.println("1 - Turno noche");
        System.out.println("2 - Turno día");

        int turno = sc.nextInt();

        if (turno != 1 && turno != 2) {
            System.out.println("Error: ingresó un turno inválido.");
            sc.close();
            return;
        }

        System.out.println("Ingrese la cantidad de horas normales trabajadas:");
        int cantHoraNormalesTrabajadas = sc.nextInt();

        System.out.println("Ingrese la cantidad de horas extra trabajadas:");
        int cantHorasExtraTrabajadas = sc.nextInt();

        if (cantHoraNormalesTrabajadas < 0 || cantHorasExtraTrabajadas < 0) {
            System.out.println("Error: las horas trabajadas no pueden ser negativas.");
            sc.close();
            return;
        }

        int horasTotales = cantHoraNormalesTrabajadas + cantHorasExtraTrabajadas;

        String turnoTrabajado = switch (turno) {
            case 1 -> "turno noche";
            case 2 -> "turno día";
            default -> throw new IllegalArgumentException("Turno inválido: " + turno);
        };

        System.out.println("\n========== RESUMEN LABORAL ==========");
        System.out.println("Empleado: " + nombre);
        System.out.println("Turno: " + turnoTrabajado);
        System.out.println("Horas totales trabajadas: " + horasTotales + " h");

        // 1. Cálculo de las horas normales

        double dineroHorasNormales = switch (turno) {
            case 1 -> cantHoraNormalesTrabajadas * horaNocturnaNormal;
            case 2 -> cantHoraNormalesTrabajadas * horaNormal;
            default -> throw new IllegalArgumentException("Turno inválido: " + turno);
        };

        System.out.println(
                "Horas normales: " + cantHoraNormalesTrabajadas
                        + " -> $" + dineroHorasNormales
        );

        // 2. Cálculo de las horas extra

        double dineroHorasExtra = switch (turno) {
            case 1 -> cantHorasExtraTrabajadas * horaExtraNocturna;
            case 2 -> cantHorasExtraTrabajadas * horaExtra;
            default -> throw new IllegalArgumentException("Turno inválido: " + turno);
        };

        System.out.println(
                "Horas extra: " + cantHorasExtraTrabajadas
                        + " -> $" + dineroHorasExtra
        );

        // 3. Cálculo del total

        double totalDia = dineroHorasNormales + dineroHorasExtra;

        if (turno == 1) {
            double recargoNocturno = totalDia - (
                    cantHoraNormalesTrabajadas * horaNormal
                            + cantHorasExtraTrabajadas * horaExtra
            );

            System.out.println("Recargo nocturno incluido: $" + recargoNocturno);
        }

        System.out.println("-------------------------------------");
        System.out.println("Total del día: $" + totalDia);
        System.out.println("=====================================");

        sc.close();
    }
}
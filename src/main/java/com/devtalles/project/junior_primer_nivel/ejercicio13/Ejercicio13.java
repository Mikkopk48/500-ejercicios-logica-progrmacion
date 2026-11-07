package com.devtalles.project.junior_primer_nivel.ejercicio13;


import java.util.Scanner;

public class Ejercicio13 {
    static public void calculadoraGoles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de fechas");
        int cantFechas = sc.nextInt();

        int totalGoles = 0;
        int partidosSinGoles = 0;
        int mejorFecha = 0;
        int mejorFechaGoles = 0;

        for (int i = 1; i <= cantFechas; i++) {
            System.out.println("Ingrese los goles de la fecha " + i);
            int goles = sc.nextInt();
            totalGoles += goles;
            if (goles == 0) partidosSinGoles++;
            if (mejorFechaGoles < goles) {
                mejorFechaGoles = goles;
                mejorFecha = i;
            }
        }
        double promGoles = (double) totalGoles / cantFechas;
        promGoles = Math.round(promGoles * 10.0) / 10.0;

        System.out.println("Goles totales: " + totalGoles);
        System.out.println("Promedio por partido: " + promGoles);
        System.out.println("Partidos sin goles: : " + partidosSinGoles);
        System.out.println("Mejor fecha: : " + mejorFecha + "(" + mejorFechaGoles + " goles)");
    }
}

package com.devtalles.project.junior_primer_nivel.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    static public void calculadoraAcademica() {
        Scanner sc = new Scanner(System.in);
        double parcial1;
        double parcial2;
        double parcial3;

        int cantPromociona = 0;
        int cantRecuperatorio = 0;
        int cantFinal = 0;

        String nombreEstudiante;
        int cuantosEstudiantes;

        System.out.println("Ingrese cuantos estudiantes va a evaluar");
        cuantosEstudiantes = sc.nextInt();
        for (int i = 1; i <= cuantosEstudiantes; i++) {

            sc.nextLine();
            System.out.println("Ingrese el nombre del estudiante");
            nombreEstudiante = sc.nextLine();

            System.out.println("Ingrese nota 1er parcial");
            parcial1 = sc.nextInt();
            System.out.println("Ingrese nota 2do parcial");
            parcial2 = sc.nextInt();
            System.out.println("Ingrese nota 3er parcial");
            parcial3 = sc.nextInt();

            double promedio = (parcial1 + parcial2 + parcial3) / 3;
            if((parcial1 == 10 || parcial2 == 10 || parcial3 == 10) && promedio >= 6.5){
                System.out.println(nombreEstudiante + ": promedio " + promedio + " -> Promociona (tiene un 10 y su promedio es mayor o igual a 6,5)");
                continue;
            }
            if (parcial1 < 4 || parcial2 < 4 || parcial3 < 4) {
                System.out.println(nombreEstudiante + ": promedio " + promedio + " -> Recuperatorio (tiene una nota menor a 4)");
                cantRecuperatorio++;
                continue;
            }
            if (promedio >= 7) {
                System.out.println(nombreEstudiante + ": promedio " + promedio + " -> Promociona (el promedio es 7 o más)");
                cantPromociona++;
            }
            if (promedio >= 4 && promedio < 7) {
                System.out.println(nombreEstudiante + ": promedio " + promedio + " -> Va a final (promedio entre 4 y 7)");
                cantFinal++;
            }
        }
        System.out.println("Promocionan " + cantPromociona + " Recuperan " + cantRecuperatorio + " Van al final " + cantFinal);
        sc.close();
    }
}

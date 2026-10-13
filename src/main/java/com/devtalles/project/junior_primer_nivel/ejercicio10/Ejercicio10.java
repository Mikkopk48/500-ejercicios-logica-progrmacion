package com.devtalles.project.junior_primer_nivel.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void calculadoraPrecioPeso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del paquete");
        String id = sc.nextLine();

        System.out.println("Ingrese cuanto pesa el paquete KILOGRAMOS.GRAMOS");
        double peso = sc.nextDouble();
        if (peso > 50) {
            System.out.println("El correo no lo acepta.");
            return;
        }

        System.out.println("Va al interior ingrese true o false");
        boolean interior = sc.nextBoolean();

        double precio = 0;

        if (peso <= 0.8) {
            precio = 2500;
        } else if (peso > 1 && peso <= 5) {
            precio = 4200;
        } else if (peso > 5 && peso <= 20) {
            precio = 7800;
        } else if (peso > 20) {
            precio = 7800;
            double pesoExtra = Math.round(peso - 20);
            precio += (pesoExtra * 450);
        } else {
            System.out.println("Tipo de dato de peso no válido");
        }

//30% mas
        if (interior) {
            double aumento = precio * 0.3;
            precio += aumento;
        }
        System.out.println(id + " (" + peso + " kg): " + "$" + precio);


    }
}


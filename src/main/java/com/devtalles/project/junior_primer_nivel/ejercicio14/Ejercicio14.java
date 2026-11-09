package com.devtalles.project.junior_primer_nivel.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    static public void calculadoraElectricidad() {
        Scanner sc = new Scanner(System.in);

        int precioPrimeros = 0;
        int precioSegundos = 0;
        int precioTerceros = 0;
        int cargoFijo = 2300;
        int subTotal;

        double iva;
        double total;

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su consumo en kWh");
        int kWhUsados = sc.nextInt();


        if (kWhUsados >= 150) {
            precioPrimeros = 14250;
            precioSegundos = (kWhUsados - 150) * 130;
        } else {
            precioPrimeros = kWhUsados * 95;
        }

        if (kWhUsados >= 401) {
            precioSegundos = 32500;
            precioTerceros = (kWhUsados - 400) * 185;
        }

        subTotal = precioPrimeros + precioSegundos + precioTerceros + cargoFijo;

        iva = (subTotal) * 0.21;

        total = subTotal + iva;


        System.out.println("Casa de " + nombre + " (" + kWhUsados + " kWh)");
        System.out.println("150 kWh x $95 = $" + precioPrimeros);
        System.out.println("250 kWh cuestan $" + precioSegundos);
        System.out.println("120 kWh cuestan $" + precioTerceros);
        System.out.println("Cargo fijo: $" + cargoFijo);
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("IVA 21%: $" + iva);
        System.out.println("Total: $" + total);

    }
}

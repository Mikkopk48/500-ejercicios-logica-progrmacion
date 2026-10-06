package com.devtalles.project.junior_primer_nivel.ejercicio4;

import java.util.Scanner;

public class Ejercicio4Bonus {
    static public void calculadoraDescuento() {
        double dejoDeCobrar = 0;
        boolean seguir = true;
        int i = 0;
        
        while (seguir) {
            i = i + 1;
            Scanner sc = new Scanner(System.in);
            double descuentoMonto = 0;
            double descuentoEfectivo = 0;

            System.out.println("Cuanto pago el cliente numero " + i + "?");
            double montoOriginal = sc.nextDouble();
            double montoFinal = montoOriginal;
            System.out.println("El cliente pago en efectivo ingrese true o false");
            boolean enEfectivo = sc.nextBoolean();
            if (montoOriginal >= 5000) {
                double antes = montoFinal;
                montoFinal *= 0.90;
                descuentoMonto = antes - montoFinal;
            }

            if (enEfectivo) {
                double antes = montoFinal;
                montoFinal *= 0.95;
                descuentoEfectivo = antes - montoFinal;

            }
            System.out.println("Subtotal: $" + montoOriginal);
            System.out.println("Descuento por monto $" + descuentoMonto);
            System.out.println("Descuento por efectivo $" + descuentoEfectivo);
            System.out.println("A pagar " + montoFinal);
            dejoDeCobrar = dejoDeCobrar + descuentoMonto + descuentoEfectivo;
            System.out.println("Don Rubén dejo de cobrar: " + dejoDeCobrar);

            System.out.println("Quiere realizar otra operación ingrese true o false?");
            seguir = sc.nextBoolean();
            if (!seguir) {
                break;
            }
        }
    }
}


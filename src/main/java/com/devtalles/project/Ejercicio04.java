package com.devtalles.project;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio04 {
    static public void calculadoraDescuento() {
        Scanner sc = new Scanner(System.in);
        final int descuento5mil = 10;
        final int porcentajeDescuentoEfectivo = 5;
        double descuentoMonto = 0;
        double descuentoEfectivo = 0;
        System.out.println("Cuanto pago el cliente?");
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
        System.out.println("Subtotal: $"+montoOriginal);
        System.out.println("Descuento por monto $"+descuentoMonto);
        System.out.println("Descuento por efectivo $"+descuentoEfectivo);
        System.out.println("A pagar " + montoFinal);


    }
}

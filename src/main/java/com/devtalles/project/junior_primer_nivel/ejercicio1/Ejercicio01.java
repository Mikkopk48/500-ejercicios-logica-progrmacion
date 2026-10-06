package com.devtalles.project.junior_primer_nivel.ejercicio1;

import java.util.Scanner;

public class Ejercicio01 {
    public static void calculadoraCuentaPropina() {

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        System.out.println("Ingrese el consumo total");
        double consumo = s1.nextDouble();
        int consumoRedondeado = (int) consumo;
        if (consumoRedondeado < consumo) {
            consumoRedondeado++;
        }
        System.out.println("Ingrese cuantas personas son");
        int totalPersonas = s3.nextInt();
        int totalCadaUno = consumoRedondeado / totalPersonas;
        double total = 0;
        double vuelto = 0;
        for (int i = 1; i < totalPersonas + 1; i++) {
            System.out.println("Ingrese el porcentaje de propina de la persona numero: " + i);
            int porcentaje = s2.nextInt();
            int totalCadaUnoMasPropina = consumoRedondeado / totalPersonas + (totalCadaUno * porcentaje / 100);
            total += totalCadaUnoMasPropina;
            System.out.println("La persona numero " + i + " debe pagar " + totalCadaUnoMasPropina);
            vuelto = consumoRedondeado - consumo;
        }
        if (vuelto != 0) {
            System.out.println("El vuelto es(extra del redondeo) " + vuelto);
        }
        //Redondea automaticamente sin librerias=============
//        int consumoRedondeado = (int) consumo;
//        if (consumo > consumoRedondeado) {
//            consumoRedondeado++;
//        }
        //===================================================
//        System.out.println("Consumo:" + consumoRedondeado);
//        System.out.println("Propina: " + propina);
//        int tatalRedondeado = (int) total;
//        if (total > tatalRedondeado) {
//            tatalRedondeado++;
//        }
//        System.out.println("Total: " + tatalRedondeado);
//        System.out.println("Cada uno paga: " + (int) Math.ceil(totalCadaUno));

//        System.out.print("Sin redondeo" + "\n" +
//                "Consumo " + consumo + " sobra(vuelto): " +
//                (consumoRedondeado - consumo) +
//                "\n" + "Total " +
//                total + " sobra(vuelto): " +
//                (tatalRedondeado - total)
//        );
        s1.close();
        s2.close();
        s3.close();
    }
}
package com.devtalles.project.junior_primer_nivel.ejercicio9;

import java.util.Scanner;
import java.util.function.Function;

public class Ejercicio9 {
    static public void cuentaRegresiva() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        boolean despego = false;
        int metrosAltura = 0;
        int metrosLlegar;
        int minuto = 0;
        double temperatura = 18;

        System.out.println("A que velocidad será el ascenso (METROSxMINUTO)");
        int velocidad = sc.nextInt();
        System.out.println("Desde que numero es la cuenta regresiva?");
        int duracion = sc.nextInt();
        System.out.println("A que altura debe llegar?");
        metrosLlegar = sc.nextInt();
        for (int i = duracion; i > 0; i--) {
            String segundo = "T-" + i;
            System.out.println(segundo);
            if (i == 5) System.out.println("Encender la radiosonda");
            if (i == 2) System.out.println("Soltar amarras");
            if (i == 1) System.out.println("¡Despegue!");
            Thread.sleep(1000);
            despego = true;
        }
        while (despego && metrosAltura <= metrosLlegar) {
            Thread.sleep(1000);

            minuto = minuto + 1;
            metrosAltura = metrosAltura + velocidad;
            System.out.println("Minuto " + minuto + ": " + metrosAltura + " m");
            if (metrosAltura >= metrosLlegar)
                System.out.println("Superó los " + metrosLlegar + " en el minuto " + minuto);

            temperatura = temperatura - 6.5;
            System.out.println("La temperatura estimada es "+temperatura);
//            int multiplo = (metrosAltura / 500) * 500;
//            if (metrosAltura > multiplo) {
//                System.out.println(metrosAltura + " supera el múltiplo de " + multiplo);
            }
        }
    }


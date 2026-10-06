package com.devtalles.project.junior_primer_nivel.ejercicio6;

public class Ejercicio6 {
    static public void calculadoraTNA() {
        double capital = 500000.00;
        double TNA = 0.36;
        int plazo = 30;
        double inflacionEsperadaMes = 2.5;
        double interesGanado = (capital * TNA * plazo) / 365;
        double totalVencimiento = interesGanado + capital;
        double rendimientoPeriodo = (interesGanado / capital) * 100;
        System.out.println("Interés ganado: " + Math.round(interesGanado * 100.0) / 100.0);
        System.out.println("Total al vencimiento: " + Math.round(totalVencimiento * 100.0) / 100.0);
        System.out.println("Rendimiento del período: " +  Math.round(rendimientoPeriodo * 100.0) / 100.0+ "%");
        if (inflacionEsperadaMes < rendimientoPeriodo) {
            System.out.println("Le ganó a la inflación del mes: " + Math.round(rendimientoPeriodo * 100.0) / 100.0 + "%");
        } else {
            double perdio = inflacionEsperadaMes - rendimientoPeriodo;
            System.out.println("Perdió contra la inflación por: " + perdio);
        }
        double interesGanadoAnio = (capital * TNA * plazo) / ((double) 365 /12);
        System.out.println("Interés ganado en un año: " +interesGanadoAnio);
    }
}

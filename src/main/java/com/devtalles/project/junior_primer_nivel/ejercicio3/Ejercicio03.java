package com.devtalles.project.junior_primer_nivel.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio03 {

    static Scanner sc = new Scanner(System.in);

    static void calculadora() {

        List<ResultadoTemperatura> resultados = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese el nombre del lugar número " + (i + 1));
            String lugar = sc.nextLine();

            System.out.println(
                    "Ingrese la temperatura del lugar " +
                            (i + 1) +
                            " en Celsius"
            );

            double celsius = sc.nextDouble();
            sc.nextLine();

            double fahrenheit = celsiusToFahrenheit(celsius);
            double kelvin = celsiusToKelvin(celsius);

            resultados.add(
                    new ResultadoTemperatura(
                            i + 1,
                            lugar,
                            celsius,
                            fahrenheit,
                            kelvin
                    )
            );
        }

        for (ResultadoTemperatura resultado : resultados) {
            resultado.mostrar();
        }
    }

    static double celsiusToFahrenheit(double celsius) {
        return Math.floor((celsius * 9 / 5 + 32) * 100) / 100;
    }

    static double celsiusToKelvin(double celsius) {
        return Math.floor((celsius + 273.15) * 100) / 100;
    }
}
class ResultadoTemperatura {

    private final int numeroLugar;
    private final String lugar;
    private final double celsius;
    private final double fahrenheit;
    private final double kelvin;

    public ResultadoTemperatura(
            int numeroLugar,
            String lugar,
            double celsius,
            double fahrenheit,
            double kelvin
    ) {
        this.numeroLugar = numeroLugar;
        this.lugar = lugar;
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }

    public void mostrar() {

        System.out.println(
                "| Lugar " + numeroLugar +
                        " | " + lugar +
                        " | Celsius | " + celsius +
                        " | Fahrenheit | " + fahrenheit +
                        " | Kelvin | " + kelvin +
                        " |"
        );

        if (celsius < 0) {
            System.out.println("(bajo cero)");
        }
    }
}
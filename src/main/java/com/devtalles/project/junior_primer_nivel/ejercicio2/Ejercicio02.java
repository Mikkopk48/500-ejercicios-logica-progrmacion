package com.devtalles.project.junior_primer_nivel.ejercicio2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Ejercicio02 {

    public static void calcularTrayecto() {

        Scanner sc = new Scanner(System.in);
        double distancia = 7.2;
        double velocidadProm = 24;
        LocalTime horaInicio1raClase = LocalTime.of(8, 45);
        System.out.println("La clase inicia "+horaInicio1raClase);

        System.out.println("Ingrese la hora de salida (HH:mm):");
        String entradaSalida = sc.next();

        LocalTime horaSalida = LocalTime.parse(entradaSalida);

        System.out.println("Ingrese la hora en la empieza la clase (HH:mm):");
        String entradaHoraClase = sc.next();

        LocalTime horaClase = LocalTime.parse(entradaHoraClase);

        System.out.println("¿Cuánto tiempo se toma en cada parada? (minutos)");
        double tiempoPorParada = sc.nextDouble();

        System.out.println("¿Cuántas paradas hubo?");
        int paradas = sc.nextInt();

        // Tiempo de movimiento
        double tiempoMovimiento = (distancia / velocidadProm) * 60;

        // Tiempo detenido en paradas
        double tiempoParadas = paradas * tiempoPorParada;

        // Tiempo total
        double tiempoTotal = tiempoMovimiento + tiempoParadas;

        System.out.println("Tiempo en movimiento: "
                + tiempoMovimiento + " minutos");

        System.out.println("Tiempo en paradas: "
                + tiempoParadas + " minutos");

        System.out.println("Tiempo total: "
                + tiempoTotal + " minutos");


        LocalTime horaLlegada =
                horaSalida.plusMinutes((long) tiempoTotal);

        System.out.println("Llega a las: " + horaLlegada);

        Duration diferencia = Duration.between(horaInicio1raClase, horaLlegada);
        long minutos = diferencia.toMinutes();

        if (horaLlegada.isAfter(horaInicio1raClase)) {
            System.out.println("Llegaras " + minutos + " tarde");
        }
        else if (horaLlegada.isBefore(horaInicio1raClase)) {
            System.out.println("Llegaras " + Math.abs(minutos) + " antes");
        }else{
            System.out.println("Llegas puntual");
        }

    }
}
//Bonus (opcional)
//• Si la primera clase empieza a las 8:45, decile a Martina cuántos minutos antes o después llega.
//• Calculá a qué hora tendría que salir para llegar exactamente 5 minutos antes de la clase.
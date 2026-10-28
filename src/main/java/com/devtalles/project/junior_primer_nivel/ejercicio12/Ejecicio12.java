package com.devtalles.project.junior_primer_nivel.ejercicio12;

import java.util.*;

public class Ejecicio12 {
    public static void calculadoraDatosMoviles() {
        Map<String,Integer> consumos = new HashMap<>();

        consumos.put("WhatsApp",1350);
        consumos.put("Videos",7420);
        consumos.put("Música",2210);
        consumos.put("Redes",750);

// 2. Calcular la suma total (con Streams)
        int totalConsumo = consumos
                .values()//Devuelve solo los valores del map
                .stream()//le dice que vaya uno por uno
                .mapToInt(Integer::intValue)//convierte los datos de un Integer a un IntStream
                //lo hace porque IntStream tiene métodos que el Integer común no los tiene
                .sum();//suma todos los numeros y devuelve un int normal

        // Calcular el promedio
        double promedio = consumos.values().stream()
                .mapToInt(Integer::intValue)
                .average()//saca el promedio
                .orElse(0.0);//dice que si el average está vacío dame 0.0
        System.out.println("Total: " + totalConsumo + "MB");
        System.out.println("Promedio: " + promedio + "MB");

    }
}

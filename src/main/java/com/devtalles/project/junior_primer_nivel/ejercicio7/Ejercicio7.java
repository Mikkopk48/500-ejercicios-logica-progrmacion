package com.devtalles.project.junior_primer_nivel.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    static public void calculadoraIMC() {
        Scanner sc = new Scanner(System.in);
        double peso;
        double altura;
        String nombre;
        String semaforo;
        String categoria;

//        sc.nextLine();
        System.out.println("Ingrese el nombre del paciente");
        nombre = sc.nextLine();
//        while (true){
        System.out.println("Ingrese el peso del paciente");
        peso = sc.nextDouble();
//        }
        System.out.println("Ingrese la altura del paciente Metros.cm");
        altura = sc.nextDouble();
        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            categoria = "BAJO";
            semaforo = "AMARILLO";
        } else if (IMC < 25) {
            categoria = "NORMAL";
            semaforo = "VERDE";
        } else if (IMC < 30) {
            categoria = "SOBREPESO";
            semaforo = "AMARILLO";
        } else {
            categoria = "OBESIDAD";
            semaforo = "ROJO";
        }
        System.out.println(nombre + " : IMC " + Math.round(IMC) + " -> " + categoria + " [" + semaforo + "]");
//        double peso
//        if(IMC < ){}
//        System.out.println("El paciente le faltan " + leFaltan + "");
//        System.out.println("El paciente le sobran " + leSobran + "");
    }
}

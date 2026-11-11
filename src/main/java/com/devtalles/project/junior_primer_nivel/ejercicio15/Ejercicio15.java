package com.devtalles.project.junior_primer_nivel.ejercicio15;

public class Ejercicio15 {

    public static void calculadoraEstadisticas() {
        // Datos iniciales
        int vidas = 3;
        int salud = 100;
        int escudo = 40;

        // Secuencia de golpes recibidos
        int[] golpes = {35, 50, 80, 20, 90, 60};

        System.out.println("--- Inicio del combate ---");

        // Bucle para recorrer cada golpe
        for (int i = 0; i < golpes.length; i++) {
            int daño = golpes[i];
            int numGolpe = i + 1;

            // Variables para guardar los textos que se mostrarán al final del golpe
            String textoVida = "";
            String textoGameOver = "";

            // Si ya está en GAME OVER, ignoramos los golpes restantes
            if (vidas <= 0) {
                continue;
            }

            // 1. Calcular cuánto absorbe el escudo y cuánto pasa a la salud
            int dañoAbsorbidoPorEscudo = Math.min(escudo, daño);
            escudo -= dañoAbsorbidoPorEscudo;

            int dañoASalud = daño - dañoAbsorbidoPorEscudo;
            salud -= dañoASalud;

            // 2. Revisar si la salud llegó a 0 o menos
            if (salud <= 0) {
                vidas--;

                if (vidas > 0) {
                    textoVida = " ¡perdió una vida!";
                    salud = 100; // La salud vuelve a 100 (el daño sobrante se pierde)
                    // El escudo no se recarga, se mantiene como estaba
                } else {
                    // Si se queda sin vidas
                    textoGameOver = " GAME OVER";
                    salud = 0; // Mostrar salud en 0 si no hay vidas
                }
            }

            // 3. Mostrar el estado después de cada golpe
            // Se arma el string respetando el formato esperado
            System.out.println("Golpe " + numGolpe + " (" + daño + "):" +
                    textoVida +
                    textoGameOver +
                    " escudo " + escudo +
                    ", salud " + salud +
                    ", vidas " + vidas);
        }

        // 4. Mostrar el estado final
        System.out.println("Estado final: vidas " + vidas + ", salud " + salud + ", escudo " + escudo);
    }
}
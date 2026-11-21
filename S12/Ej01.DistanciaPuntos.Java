
/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 01: Distancia entre dos puntos
 * Enunciado: Calcular la distancia entre dos puntos utilizando
 * Math.sqrt y Math.pow.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej01_DistanciaPuntos {

    public static void main(String[] args) {

        double x1 = 2;
        double y1 = 3;

        double x2 = 6;
        double y2 = 7;

        double distancia = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );

        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}

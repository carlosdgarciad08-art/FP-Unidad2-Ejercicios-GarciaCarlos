
/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Dados que suman 7
 * Enunciado: Realizar 1000 lanzamientos de dos dados utilizando
 * Random y mostrar el conteo y el porcentaje de resultados cuya
 * suma sea igual a 7.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej02_DadosSumanSiete {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int contador = 0;
        int lanzamientos = 1000;

        for (int i = 0; i < lanzamientos; i++) {

            int dado1 = aleatorio.nextInt(6) + 1;
            int dado2 = aleatorio.nextInt(6) + 1;

            if (dado1 + dado2 == 7) {
                contador++;
            }
        }

        double porcentaje = (contador * 100.0) / lanzamientos;

        System.out.println("Cantidad de veces que sumó 7: " + contador);
        System.out.println("Porcentaje: " + porcentaje + "%");
    }
}

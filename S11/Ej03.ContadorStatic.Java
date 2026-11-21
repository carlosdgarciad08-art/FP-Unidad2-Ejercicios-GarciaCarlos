

/*
 * Sesión: S11 - Ámbito de variables
 * Ejercicio 03: Traza del contador static
 * Enunciado: Analizar cómo cambia el valor de una variable static.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej03_ContadorStatic {

    static int contador = 0;

    public static void incrementar() {
        contador++;
    }

    public static void main(String[] args) {

        System.out.println(contador); // Línea 1: 0

        incrementar();

        System.out.println(contador); // Línea 2: 1

        incrementar();
        incrementar();

        System.out.println(contador); // Línea 3: 3
    }
}

/*
 * TABLA DE TRAZA:
 *
 * Línea | Variables vivas | Valor
 *  1    | contador        |  0
 *  2    | contador        |  1
 *  3    | contador        |  3
 */



/*
 * Sesión: S10 - Métodos
 * Ejercicio 02: Intercambiar elementos de un arreglo
 * Enunciado: Intercambiar dos posiciones de un arreglo de enteros.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej02_IntercambiarArreglo {

    public static void intercambiar(int[] v, int i, int j) {

        int auxiliar = v[i];
        v[i] = v[j];
        v[j] = auxiliar;
    }

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40};

        intercambiar(numeros, 0, 2);

        System.out.println("Arreglo después del intercambio:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}

/*
 * ¿Por qué ahora sí funciona?
 * Porque el método recibe una referencia al mismo arreglo.
 * Al modificar sus posiciones, también se modifica el
 * arreglo original.
 *
 * Salida:
 * 30 20 10 40
 */

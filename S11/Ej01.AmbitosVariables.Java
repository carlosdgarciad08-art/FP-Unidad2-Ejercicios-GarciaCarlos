
/*
 * Sesión: S11 - Ámbito de variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: Identificar las variables locales, de bloque y static.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej01_AmbitosVariables {

    static int contador = 0; // Variable static

    public static void main(String[] args) {

        int edad = 20; // Variable local

        if (edad >= 18) {

            String mensaje = "Mayor de edad"; // Variable de bloque

            System.out.println(mensaje);
        }

        int numero = 10; // Variable local

        System.out.println("Edad: " + edad);
        System.out.println("Número: " + numero);
        System.out.println("Contador: " + contador);
    }
}


/*
 * Sesión: S11 - Ámbito de variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: Identificar errores de compilación, su mensaje y causa.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej02_ErroresCompilacion {

    public static void main(String[] args) {

        int edad = 20;

        // System.out.println(nombre);
        // Error: cannot find symbol.
        // Causa: la variable nombre no está declarada.

        // edad = "veinte";
        // Error: incompatible types: String cannot be converted to int.
        // Causa: se intenta guardar un texto en una variable entera.

        if (edad > 18) {

            int numero = 10;
        }

        // System.out.println(numero);
        // Error: cannot find symbol.
        // Causa: la variable numero fue declarada dentro del bloque if.
    }
}




/*
 * Sesión: S11 - Ámbito de variables
 * Ejercicio 04: Reescribir sin static
 * Enunciado: Reescribir un método sin utilizar static,
 * empleando parámetros y return.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej04_ReescribirSinStatic {

    /*
     * VERSION ORIGINAL CON STATIC:
     *
     * public static int sumar(int a, int b) {
     *     return a + b;
     * }
     */

    // VERSION REESCRITA SIN STATIC

    public int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Ej04_ReescribirSinStatic objeto =
                new Ej04_ReescribirSinStatic();

        int resultado = objeto.sumar(10, 20);

        System.out.println("Resultado de la suma: " + resultado);
    }
}

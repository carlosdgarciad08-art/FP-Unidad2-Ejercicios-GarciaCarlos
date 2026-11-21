

/*
 * Sesión: S10 - Métodos
 * Ejercicio 01: Intercambiar variables
 * Enunciado: Intercambiar dos variables enteras mediante un método.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej01_IntercambiarVariables {

    public static void intercambiar(int a, int b) {
        int auxiliar = a;
        a = b;
        b = auxiliar;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        intercambiar(x, y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

/*
 * ¿Funciona?
 * No, porque Java pasa los valores de las variables primitivas
 * por valor. El método intercambia copias y no modifica
 * las variables originales.
 *
 * Salida:
 * x = 10
 * y = 20
 */


/*
 * Sesión: S10 - Métodos
 * Ejercicio 05: Predicción de salida
 * Enunciado: Realizar tres llamadas a un método y comparar
 * la salida predicha con la salida real.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej05_PrediccionSalida {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sumar(10, 5));
        System.out.println(sumar(20, 10));
        System.out.println(sumar(7, 5));
    }
}

/*
 * SALIDA PREDICHA:
 * 15
 * 30
 * 12
 *
 * SALIDA REAL:
 * 15
 * 30
 * 12
 */

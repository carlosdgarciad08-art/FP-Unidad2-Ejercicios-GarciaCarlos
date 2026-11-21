

/*
 * Sesión: S10 - Métodos
 * Ejercicio 03: Aplicar descuento
 * Enunciado: Aplicar un porcentaje de descuento a los precios
 * de un arreglo e imprimir los valores antes y después.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej03_AplicarDescuento {

    public static void aplicarDescuento(double[] precios, double pct) {

        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * pct / 100);
        }
    }

    public static void main(String[] args) {

        double[] precios = {100, 200, 300};

        System.out.println("Precios originales:");

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

        aplicarDescuento(precios, 20);

        System.out.println("Precios con descuento:");

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
    }
}

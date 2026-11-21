

/*
 * Sesión: S10 - Métodos
 * Ejercicio 04: Sobrecarga de métodos perimetro
 * Enunciado: Calcular el perímetro de un cuadrado y un rectángulo
 * utilizando métodos sobrecargados.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

public class Ej04_SobrecargaPerimetro {

    public static double perimetro(double lado) {
        return 4 * lado;
    }

    public static double perimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {

        double cuadrado = perimetro(5);
        double rectangulo = perimetro(8, 4);

        System.out.println("Perímetro del cuadrado: " + cuadrado);
        System.out.println("Perímetro del rectángulo: " + rectangulo);
    }
}

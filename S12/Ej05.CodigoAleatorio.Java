

/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 05: Código de 6 caracteres
 * Enunciado: Generar un código compuesto por 3 letras aleatorias
 * y 3 dígitos aleatorios utilizando Random.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_CodigoAleatorio {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        String codigo = "";

        // Generar tres letras aleatorias
        for (int i = 0; i < 3; i++) {

            char letra = (char) ('A' + aleatorio.nextInt(26));

            codigo = codigo + letra;
        }

        // Generar tres dígitos aleatorios
        for (int i = 0; i < 3; i++) {

            int digito = aleatorio.nextInt(10);

            codigo = codigo + digito;
        }

        System.out.println("Código generado: " + codigo);
    }
}

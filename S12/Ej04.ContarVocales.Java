
/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 04: Contar vocales
 * Enunciado: Contar las vocales de una frase utilizando String
 * y Character, incluyendo mayúsculas y minúsculas.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej04_ContarVocales {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            char vocal = Character.toLowerCase(frase.charAt(i));

            if (vocal == 'a' || vocal == 'e' ||
                vocal == 'i' || vocal == 'o' ||
                vocal == 'u') {

                contador++;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);

        entrada.close();
    }
}

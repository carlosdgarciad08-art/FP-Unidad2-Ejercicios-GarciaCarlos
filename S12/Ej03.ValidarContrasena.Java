
/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Validar una contraseña
 * Enunciado: mínimo 8 caracteres, al menos una mayúscula y un dígito.
 * Autor: Carlos David García Díaz
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ej03_ValidarContrasena {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = entrada.nextLine();

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < contrasena.length(); i++) {

            char caracter = contrasena.charAt(i);

            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }
        }

        if (contrasena.length() >= 8
                && tieneMayuscula
                && tieneDigito) {

            System.out.println("Contraseña válida.");

        } else {

            System.out.println("Contraseña no válida.");
            System.out.println("Debe tener mínimo 8 caracteres,");
            System.out.println("al menos una letra mayúscula y un dígito.");
        }

        entrada.close();
    }
}


public class Ej05_PrediccionSalida {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // SALIDA PREDICHA:
        // Resultado 1: 15
        // Resultado 2: 30
        // Resultado 3: 12

        System.out.println("Resultado 1: " + sumar(10, 5));
        System.out.println("Resultado 2: " + sumar(20, 10));
        System.out.println("Resultado 3: " + sumar(7, 5));

        // SALIDA REAL:
        // Resultado 1: 15
        // Resultado 2: 30
        // Resultado 3: 12
    }
}

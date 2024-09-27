package ejercicios;

public class Ejercicio18 {
    //Calcular potencia
    //•	Descripción: Dado el número a = 2 y la potencia b = 8, calcula , es decir, 2 elevado a la potencia de 8.
    //•	Variables: a = 2, b = 8.

    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        System.out.println(a + " elevado a la potencia de " + b + " es: " + result);
    }
}

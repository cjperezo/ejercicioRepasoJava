package ejercicios;

public class Ejercicio17 {
    //Suma de números pares en un rango
    //•	Descripción: Suma todos los números pares entre a = 1 y b = 100. Un número es par si es divisible por 2.
    //•	Variables: a = 1, b = 100.

    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("La suma de todos los números pares entre " + a + " y " + b + " es: " + sum);
    }
}

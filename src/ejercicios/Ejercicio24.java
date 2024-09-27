package ejercicios;

public class Ejercicio24 {
    //Sumar los múltiplos de un número en un rango
    //•	Descripción: Suma todos los múltiplos de a = 3 dentro del rango de 1 a 50. Un múltiplo de un número es el resultado de multiplicarlo por un entero.
    //•	Variables: a = 3, rango de 1 a 50.

    public static void main(String[] args) {
        int a = 3;
        int rangeStart = 1;
        int rangeEnd = 50;
        int sum = 0;

        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % a == 0) {
                sum += i;
            }
        }

        System.out.println("La suma de todos los múltiplos de " + a + " en el rango de " + rangeStart + " a " + rangeEnd + " es: " + sum);
    }
}

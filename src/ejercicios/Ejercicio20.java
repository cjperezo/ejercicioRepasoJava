package ejercicios;

public class Ejercicio20 {
    //Número Armstrong
    //•	Descripción: Determina si el número a = 153 es un número Armstrong.
    //               Un número Armstrong es igual a la suma de sus dígitos elevados a la potencia del número de dígitos.
    //•	Variables: a = 153.

    public static void main(String[] args) {
        int a = 153;
        int numeroOriginal = a;
        int numerodeDigitos = String.valueOf(a).length();
        int sum = 0;

        while (a != 0) {
            int digito = a % 10;
            sum += Math.pow(digito, numerodeDigitos);
            a /= 10;
        }

        if (sum == numeroOriginal) {
            System.out.println(numeroOriginal + " es un número Armstrong.");
        } else {
            System.out.println(numeroOriginal + " no es un número Armstrong.");
        }
    }
}


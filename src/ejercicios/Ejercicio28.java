package ejercicios;

public class Ejercicio28 {
    //Calcular el máximo común divisor (MCD)
    //•	Descripción: Dados los números a = 48 y b = 18, calcula su MCD (máximo común divisor). El MCD es el número más grande que divide exactamente a ambos números.
    //•	Variables: a = 48, b = 18.

    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("El MCD de 48 y 18 es: " + a);
    }
}

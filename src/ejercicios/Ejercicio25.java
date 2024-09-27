package ejercicios;

public class Ejercicio25 {
    //Generar tabla de multiplicar
    //•	Descripción: Genera la tabla de multiplicar del número a = 7.
    //•	Variables: a = 7.

    public static void main(String[] args) {
        int a = 7;

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}

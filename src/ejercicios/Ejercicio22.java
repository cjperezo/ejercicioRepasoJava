package ejercicios;

public class Ejercicio22 {
    //Conteo de dígitos de un número
    //•	Descripción: Cuenta cuántos dígitos tiene el número a = 987654. El resultado sería 6 dígitos.
    //•	Variables: a = 987654

    public static void main(String[] args) {
        int a = 987654;
        int conteo = 0;

        while (a != 0) {
            a /= 10;
            conteo++;
        }

        System.out.println("El número tiene " + conteo + " dígitos.");
    }
}

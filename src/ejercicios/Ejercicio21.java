package ejercicios;

public class Ejercicio21 {
    //Raíz cuadrada sin usar librerías
    //•	Descripción: Calcula la raíz cuadrada del número a = 49 sin usar funciones predefinidas. La raíz cuadrada de 49 es 7.
    //•	Variables: a = 49.

    public static void main(String[] args) {
        double a = 49;
        double epsilon = 1e-10; // Precisión deseada
        double guess = a / 2.0; // Suposición inicial

        while (Math.abs(guess * guess - a) > epsilon) {
            guess = (guess + a / guess) / 2.0;
        }

        System.out.println("La raíz cuadrada de " + a + " es aproximadamente: " + guess);

    }
}

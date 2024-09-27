package ejercicios;

public class Ejercicio8 {
    //Conversión de temperatura
    //•	Descripción: Dado que la temperatura es c = 25 grados Celsius, conviértela a Fahrenheit usando la fórmula:
    //•	Variables: c = 25.

    public static void main(String[] args) {
        int c= 25;

        //Convertimos los grados celcius a fahrenheit
        double f= (9/5 * c) + 32;

        //Mostramos el resultado
        System.out.println("25 °celsius equivalen a" + " " + f + " " + "°fahrenheit" );
    }
}

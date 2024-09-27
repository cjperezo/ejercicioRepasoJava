package ejercicios;

public class Ejercicio9 {
    //Suma de los primeros N números naturales
    //•	Descripción: Dado el número N = 50, calcula la suma de los primeros N números naturales. Los números naturales son los enteros positivos comenzando desde 1.
    //•	Variables: N = 50.

    public static void main(String[] args) {
        int N= 50;

        //Calculamos la suma de los primeros N numeros naturales
        int suma= (N * (N + 1)) / 2;

        //Mostramos el resultado
        System.out.println("La suma de los primeros N números naturales es" + " " + suma);
    }
}

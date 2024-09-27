package ejercicios;

public class Ejercicio11 {
    //Fibonacci
    //•	Descripción: Genera los primeros N = 10 números de la secuencia de Fibonacci, donde cada número es la suma de los dos anteriores. La secuencia comienza con 0 y 1.
    //•	Variables: N = 10.

    public static void main(String[] args) {
        int N=10;
        int[] fibonacci= new int[N];

        //Inicializamos los primeros dos números de la secuencia
        int a= 0;
        int b= 1;

        System.out.println("Los primeros " + N + " números de la secuencia de Fibonacci son: ");
        for(int i= 0; i< N; i++){
            System.out.println(a + " "); // Calcular el número actual

            int siguiente= a + b;
            a= b; //Actualizamos a b el siguiente número
            b= siguiente; //Actualizamos b al nuevo número
        }
    }
}

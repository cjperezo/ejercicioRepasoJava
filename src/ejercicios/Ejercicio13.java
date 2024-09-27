package ejercicios;

public class Ejercicio13 {
    //Palíndromo de un número
    //•	Descripción: Determina si el número a = 1221 es palíndromo, es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
    //•	Variables: a = 1221.

    public static void main(String[] args) {
        int a = 1221;
        int numerooriginal= a;
        int numeroinvertido= 0;

        while (a> 0){
            int digito= a% 10;
            numeroinvertido= numeroinvertido* 10 + digito;
            a= a/ 10;
        }
        if(numerooriginal == numeroinvertido){
            System.out.println("El número " + numerooriginal + " es un Palindromo");
        } else {
            System.out.println("El número " + numerooriginal + " no es un Palindromo");
        }
    }
}

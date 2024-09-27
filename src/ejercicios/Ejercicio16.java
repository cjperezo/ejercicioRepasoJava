package ejercicios;

public class Ejercicio16 {
    //Sumar dígitos de un número
    //•	Descripción: Dado el número a = 5678, suma todos sus dígitos. El resultado sería 5 + 6 + 7 + 8 = 26.
    //•	Variables: a = 5678

    public static void main(String[] args) {
        int a= 5678;
        int suma= 0;

        while (a>0){
            int digito = a % 10;
            suma += digito;
            a = a / 10;
        }

        System.out.println("La suma de os dígitos es: " + suma);
    }
}

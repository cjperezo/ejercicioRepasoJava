package ejercicios;

public class Ejercicio26 {
    //Valor absoluto
    //•	Descripción: Determina el valor absoluto del número a = -15. El valor absoluto es la distancia de un número al 0, ignorando su signo.
    //•	Variables: a = -15

    public static void main(String[] args) {
        int a = -15;
        int valorAbsoluto;

        if (a < 0) {
            valorAbsoluto = -a;
        } else {
            valorAbsoluto = a;
        }

        System.out.println("El valor absoluto de " + a + " es: " + valorAbsoluto);
    }
}

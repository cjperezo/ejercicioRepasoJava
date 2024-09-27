package ejercicios;

public class Ejercicio4 {
    //Números primos
    //•	Descripción: Dado el número a = 29, determina si es primo. Un número primo solo tiene dos divisores: 1 y él mismo.
    //•	Variables: a = 29.

    public static void main(String[] args){
        int a= 29; //Valor del número que queremos evaluar
        boolean esPrimo= true; // Suponemos que es primo

        //Comprobamos divisibilidad solo hasta la mitad de 'a'
        if(a<=1){
            esPrimo = false; // Números menores o iguales a 1 no son primos
        } else {
            for (int i=2; i<=a/2;i++) {
                if (a%i ==0) {
                    esPrimo= false; // Encontramos un divisor
                    break; // Salimos del bucle
                }
            }
        }
        //Mostramos el resultado
        if(esPrimo){
            System.out.println(a + " " + "es un número primo");
        } else {
            System.out.println(a + " " + "no es un número primo");
        }

    }
}

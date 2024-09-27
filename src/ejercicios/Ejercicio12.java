package ejercicios;

public class Ejercicio12 {
    //Inversión de un número
    //•	Descripción: Dado el número a = 54321, invierte el orden de sus dígitos. El resultado sería 12345.
    //•	Variables: a = 54321.

    public static void main(String[] args) {
        int a= 54321;
        int numeroinvertido= 0;

        //Mientras a sea mayor a 0, seguimos invirtiendo
        while (a>0){
            int digito = a% 10; //Obtener el último dígito

            numeroinvertido = numeroinvertido * 10 + digito; //Añadir el digito invertido al número resultado

            a = a/10; // Quitar el ultimo digito del número original

            //Mostrar resultado
            System.out.println("El número invertido es: "+ numeroinvertido);
        }

    }
}

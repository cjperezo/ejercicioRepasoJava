package ejercicios;

public class Ejercicio10 {
    //Factorial de un número
    //•	Descripción: Dado el número a = 6, calcula su factorial. El factorial de un número se obtiene multiplicando todos los números desde 1 hasta el número dado.
    //•	Variables: a = 6.

    public static void main(String[] args) {
        int a= 6;
        long factorial= 1;

        //Calculamos el factorial de a
        for (int i=1; i<=a; i++){
            factorial*= i;

            //Mostramos el resultado
            System.out.println("El factorial de "+ a + " " + "es" + " " + factorial);
        }

    }
}

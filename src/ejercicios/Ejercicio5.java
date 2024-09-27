package ejercicios;

public class Ejercicio5 {
    //Máximo de tres números
    //•	Descripción: Dados los números a = 5, b = 12 y c = 9, encuentra cuál de ellos es el mayor.
    //•	Variables: a = 5, b = 12, c = 9.

    public static void main(String[] args) {
        int a= 5;
        int b= 12;
        int c= 9;

        int mayor;

        //Comparamos lo números
        if(a>=b && a>=c) {
            mayor = a; //'a' es el mayor
        } else if (b>=a && b>=c) {
            mayor = b; //'b' es el mayor
        } else {
            mayor = c; // 'c' es el mayor
        }

        //Mostramos el resultado
        System.out.println("El número mayor es:" + mayor);
    }
}

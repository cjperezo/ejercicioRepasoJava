package ejercicios;

public class Ejercicio6 {
    //Promedio de tres números
    //•	Descripción: Dados los números a = 4, b = 9 y c = 13, calcula el promedio de los tres.
    //•	Variables: a = 4, b = 9, c = 13.

    public static void main(String[] args) {
        int a= 4;
        int b= 9;
        int c= 13;

        //Calculamos el promedio
        double promedio = (a +b + c)/ 3;

        //Mostramos el resultado
        System.out.println("El promedio de a+b+c es" + " " + promedio);

    }
}

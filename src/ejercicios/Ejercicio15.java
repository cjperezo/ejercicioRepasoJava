package ejercicios;

public class Ejercicio15 {
    //Calcular el área de un círculo
    //•	Descripción: Dado el radio r = 7 de un círculo, calcula su área usando la fórmula:
    //•	 Variables: r = 7.

    public static void main(String[] args) {
        double r = 7;
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("El área de un círculo con radio " + r + " es: " + area);
    }
}

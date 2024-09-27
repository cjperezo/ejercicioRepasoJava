package ejercicios;

public class Ejercicio7 {
    //Área de un triángulo
    //•	Descripción: Dadas la base b = 5 y la altura h = 8 de un triángulo, calcula su área usando la fórmula

    public static void main(String[] args) {
        int b= 5;
        int h= 8;

        //Calculamos el area de un triangulo
        int triangulo= (b * h)/2;

        //Mostramos el resultado
        System.out.println("El área del triangulo es igual a" + " " + triangulo);
    }
}

package ejercicios;

public class Ejercicio14 {
    //Conversión de decimal a binario
    //•	Descripción: Dado el número decimal a = 45, conviértelo a binario.
    //•	Variables: a = 45.

    public static void main(String[] args) {
        int a= 45;
        StringBuilder binario = new StringBuilder(); // Construye la cadena binaria

        // Convertir a binario
        while (a>0){
            int residuo= a % 2;
            binario.append(residuo);
            a = a / 2;
        }
            binario.reverse();

            //Mostrar el resultado
            System.out.println("El número en binario es " + binario);

    }
}

/*8. Escribe un programa que lea del teclado un número real de grados Fahrenheit y lo convierta en Celsius mostrando el resultado en la pantalla.
La fórmula para pasar de grados Celsius es: ºC = 5/9 * (ºF - 32)*/
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String args[]){

        Scanner scaner1 = new Scanner(System.in);
        System.out.println("Introduce los grados Fahrenheit: ");
        double gradosFahrenheit = scaner1.nextDouble();

        double gradosCelsius = 0.55555555555 * (gradosFahrenheit - 32 );

        System.out.println(gradosFahrenheit + "ºF Son " + gradosCelsius + "ºC");

    }

}

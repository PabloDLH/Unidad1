/* Escribe un programa que sume, reste, multiplique y divida dos números enteros introducidos por teclado. */
import java.util.Scanner;
public class OperacionesEnteros {
    public static void main(String args[]){
        Scanner recogida1 = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = recogida1.nextInt();
        Scanner recogida2 = new Scanner(System.in);
        System.out.print("Introduce el segundo número: ");
        int num2 = recogida2.nextInt();


        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + ( num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Resto: " + (num1 % num2));

    }
}

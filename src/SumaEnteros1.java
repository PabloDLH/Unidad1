/* Realiza un programa que pida dos números enteros y luego muestre el resultado de su multiplicación.*/
import java.util.Scanner;

public class SumaEnteros1 {
    public static void main(String args[]){
        Scanner recogida1 = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = recogida1.nextInt();
        Scanner recogida2 = new Scanner(System.in);
        System.out.println("Introduce el segundo número: ");
        int num2 = recogida2.nextInt();

        System.out.println("el resultado de la suma es: " + (num1 + num2));


    }
}

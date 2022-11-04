/* Escribe un programa que pida por teclado una cantidad en segundos y devuelva su correspondencia a horas, minutos y segundos.
 Pista: Tendremos que jugar con las divisiones y los restos.*/
import java.util.Scanner;
public class SegundosaHoras {
    public static void main(String args[]){
        Scanner recogida1 = new Scanner(System.in);
        System.out.println("Introduce los segundos: ");
        long num1 = recogida1.nextLong();
        System.out.println("Horas: " + (num1 / 3600));
        System.out.println("minutos " + (num1 % 3600 / 60));
        System.out.println("segundos " + (num1 % ( 3600 / 60) ));
    }
}
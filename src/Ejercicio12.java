/*12. Escribe un programa que lea del teclado una letra e imprima su carácter ASCII así como los tres siguientes caracteres:
Introduce un carácter: E
Código ASCII de E es 69
Los tres siguientes caracteres son: F - G - H*/
import java.util.Scanner;
public class Ejercicio12 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un carácter: ");
            String letra = sc.next();

        char caracter =letra.charAt(0);
        System.out.println("Código ASCII de "+ letra + " es " + (int)caracter);

        int siguiente1 = (int)caracter +1;
        int siguiente2 = (int)caracter +2;
        int siguiente3 = (int)caracter +3;


        System.out.println("Los tres siguientes caracteres son: " + (char)siguiente1 + " - " + (char)siguiente2 +" - " + (char)siguiente3);
    }
}

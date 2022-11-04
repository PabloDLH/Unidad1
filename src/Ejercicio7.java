/*6. Escribe un programa que pase de dolares a euros.*/
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String args[]){
        double euroDolar =  0.8507;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio en dolares: ");
        double precioDolar= sc.nextDouble();
        double precioEuro = precioDolar * euroDolar;
        System.out.println(precioDolar + "$ = "+ precioEuro + "€");
    }
}

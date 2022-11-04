/*6. Escribe un programa que pase de euros a dólares (1€ = 1,1755$).*/
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String args[]){
        double dolarEuro =  1.1755;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio en euros: ");
        double precioEuro= sc.nextDouble();
        double precioDolar = precioEuro * dolarEuro;
        System.out.printf( precioEuro  + "€ = "+ precioDolar + "$");
    }
}
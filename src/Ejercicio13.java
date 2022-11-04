/*13. Escribe un programa que lea una cantidad entera en euros y realice el desglose en billetes priorizando los más grandes. Ejemplo de ejecución:*/
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad: ");
        int cantidad = sc.nextInt();

        int billetes500 = (cantidad / 500);
        int billetes200 = (cantidad %500) /200 ;
        int billetes100 = (cantidad - ((billetes500 *500) + (billetes200 * 200))) /100;
        int billetes50 = (cantidad - ((billetes500 *500) + (billetes200 * 200) + (billetes100 * 100))) /50;
        int billetes20 = (cantidad - ((billetes500 *500) + (billetes200 * 200) + (billetes100 * 100) + (billetes50 * 50))) /20;
        int billetes10 = (cantidad - ((billetes500 *500) + (billetes200 * 200) + (billetes100 * 100) + (billetes50 * 50) + (billetes20 * 20))) /10;
        int billetes5 = (cantidad - ((billetes500 *500) + (billetes200 * 200) + (billetes100 * 100) + (billetes50 * 50) + (billetes20 * 20) + ( billetes10 * 10))) /5;
        int monedas = (cantidad - ((billetes500 *500) + (billetes200 * 200) + (billetes100 * 100) + (billetes50 * 50) + (billetes20 * 20) + ( billetes10 * 10) + (billetes5 * 5)));
        System.out.printf("Billetes de 500 euros : %d \nBilletes de 200: %d\nBilletes de 100: %d\nBilletes de 50: %d \nBilletes de 20: %d\nBilletes de 10: %d" +
                          "\nBilletes de 5: " +"%d\nEuros en monedas: %d", billetes500, billetes200,billetes100,billetes50,billetes20,billetes10,billetes5,monedas);
    }
}
import java.util.Scanner;
/* Realiza un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA).
La base imponible estará almacenada en una variable. El IVA estará en una constante.*/
public class CalcularIva {
    static final double IVA = 1.21;
    static double baseImponible;
    public static void main(String args[]){
        Scanner objeto = new Scanner(System.in);
         double baseImponible;
        System.out.println("Introduce la base imponible: ");
        baseImponible = objeto.nextDouble();
        System.out.print( IVA * baseImponible);
    }
}

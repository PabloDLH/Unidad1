import java.util.Scanner;
/*10. Escribe un programa que solicite la longitud y anchura en metros de una habitación e imprima su superficie con cuatro decimales.*/
public class Ejercicio10 {
    public static void main(String args[]){
        Scanner recogida1 = new Scanner(System.in);

        System.out.print("Introduzca la longitud: ");
        double longitud = recogida1.nextDouble();

        System.out.print("Introduzca la anchura: ");
        double anchura = recogida1.nextDouble();

        double area = (anchura * longitud);
        System.out.print("Metros cuadrados: " + (String.format("%.4f", area )) );
    }
}
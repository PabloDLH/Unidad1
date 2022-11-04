/*14. Escribe un programa que permita calcular la cantidad mensual a pagar y el pago total para un préstamo de una cantidad,
un interés anual, y en una duración en años dada. La fórmula para calcular el pago mensual es la siguiente:
CantidadPrestada *Interes-1 *(1+interés mensual) = número de pagos

**Introducción de datos para el cálculo**
Cantidad prestada: 100000
Interés anual (%): 5.75
Duración del préstamo en años: 15

**Resultado de la operación**
Cantidad prestada: 100000 euros
Interés anual: 5.75%
Duración del préstamo en años: 15
Número de pagos: 180
Pago mensual: 830.414 euros

Cantidad total a pagar: 149474 euros */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad a prestar: ");
        double CantidadPrestada = sc.nextDouble();

        System.out.println("Introduzca el interes anual: ");
        double Interes = sc.nextDouble();

        System.out.println("Introduzca la duración del prestamo en años: ");
        double Duracion = sc.nextDouble();

        double numeroPagos = Duracion*12;
        double PagoMensual = (CantidadPrestada /*multiplicado por interes*/) / numeroPagos;

        System.out.printf("Cantidad prestada: %.0f,\nInterés anual:  %f\nDuración del préstamo en años: %.0f\nNúmero de pagos :%.0f\nPago mensual: %f",CantidadPrestada,Interes,Duracion,numeroPagos,PagoMensual);

    }
}

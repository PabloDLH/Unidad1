import java.util.Scanner;

/* Escribe un programa que defina la constante PI como 3.1416 que calcule e imprima el área de un círculo cuyo radio se pide por pantalla. (área del círculo = PI*radio^2).*/
public class Ejercicio5 {
    static final double PI = 3.1416;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.println("Introduce el radio: ");
        radio = sc.nextDouble();
        double area=  ( PI* (radio*radio));
        System.out.println("El area es: " + area);
    }
}

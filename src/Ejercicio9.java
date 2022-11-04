/*9. Escribe un programa que lea del teclado un tiempo transcurrido en segundos y muestre por pantalla las horas, minutos y segundos equivalentes.*/
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los segundos: ");
        int entrada = sc.nextInt();
        int semanas = entrada / 604800;
        int dias = (entrada % 604800) / 86400;
        int horas = (entrada - ((semanas * 604800)+ (dias *  86400))) / 3600;
        int minutos = (entrada % 3600)   / 60;
        int segundos2 = (entrada % 60 );
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("minutos: " + minutos);
        System.out.println("segundos: " + segundos2);
    }
}
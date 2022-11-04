/*11. Escribe un programa que lea dos números enteros y aplique sobre ellos todos los operadores aritméticos
(suma, resta, multiplicación, división entera, módulo, postincremento del primero, preincremento del primero de ellos, postdecremento y predecremento del segundo),
 visualizando todas las operaciones con sus resultados.*/

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        System.out.println(num1 +  " + " + num2 + " = " + suma  );

        double resta = num1 - num2;
        System.out.println(num1 +  " - " + num2 + " = " + resta  );

        double multiplicacion = num1 * num2;
        System.out.println(num1 +  " x " + num2 + " = " + multiplicacion  );

        double division = num1 / num2;
        System.out.println(num1 +  " / " + num2 + " = " + division  );

        double resto = num1 % num2;
        System.out.println(num1 +  " % " + num2 + " = " + resto  );

        double preinc1 = ++num1;
        double postinc1 = num1++;
        double predec2 = --num2;
        double postdec2 = num2--;

        System.out.println("Postincremento del primero: " + postinc1 + "\n" + "Preincremento del primero: " + preinc1 + "\n" +"Postdecremento del segundo: " + postdec2 + "\n" + "Predecremento del segundo: " + predec2 + "\n"  );





    }
}

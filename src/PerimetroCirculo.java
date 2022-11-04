import java.util.Scanner;

/* Escribe un programa que calcule el perímetro del círculo. (Pi debe ser una constante).
Pista: una constante se declara como una variable anteponiendo la palabra final delante.
Además su nombre lo escribimos en mayusculas para distinguirlo. El símbolo de la multiplicación es *
 */
public class PerimetroCirculo {
    static final double PI = 3.1415;

    public static void main(String[] args){
        Scanner objeto = new Scanner(System.in);
        double numero;
        System.out.println("Introduce el diametro: ");
        numero = objeto.nextDouble();
        System.out.println("El perimetro es: " +  numero * PI);
        }
}

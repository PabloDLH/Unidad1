/* Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 1000 y 2000 respectivamente.
 A continuación muestra por pantalla el valor de cada variable, la suma, la resta, la multiplicación, la división y el resto.
  Pista: suma +, resta -, multiplicación *, división /, resto %. La división es entera; Ej: 23:2 = 11, 23%2 = 1*/
public class Operaciones {
     static int x = 1000;
     static int y = 2000;
        public static void  main(String [] args){
            System.out.println("Valores variables: " + "x="+  x +" y=" + y );
            System.out.println("Suma: " + (x + y));
            System.out.println("Resta: " + (x - y));
            System.out.println("Multiplicacion: " + ( x * y));
            System.out.println("División: " + (x / y));
            System.out.println("Resto: " + (x % y));
        }
    }
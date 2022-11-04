/* Escribe un programa que defina una constante que represente el número de meses del año y una variable para almacenar un número de mes,
inicializado con el valor que desees. El programa debe imprimir por pantalla el orden (número) de mes y la porción de año transcurrida.

 ejemplo:
Mes 8 de 12
Porcentaje transcurrido: 66.6667%*/

public class Ejercicio4 {
    static final double MESES = 12;
    static double mesEjemplo =7;
        public static void main(String args[]){
            System.out.println("Mes " + mesEjemplo + " de " + MESES );
            double porcentaje = ((mesEjemplo *100) / MESES);
            System.out.println("Porcentaje transcurrido: " + ( porcentaje + "%"));
        }
}

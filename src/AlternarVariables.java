/* Escribe un programa en el que se definan dos variables y se intercambie el valor que contienen, imprimiendo el resultado por pantalla.
Pista: Necesitaremos utilizar una variable auxiliar en la que almacenar temporalmente el valor de una para no "machacarlo"*/
public class AlternarVariables {
    static int variable1 = 1;
    static int variable2 = 2;
    static int variableAux = variable1;

        public static void main(String args[]){
            System.out.print( variable1);
            System.out.print( variable2 + "\n");


            variable1 = variable2;
            variable2 = variable1;



            System.out.print( variable1);
            System.out.print( variable2);
        }
}

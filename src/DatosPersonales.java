/*Crea un programa con las variables nombre, dirección y teléfono y asígnale los valores correspondientes a tus datos personales.
 Muestra los valores de estas variables por pantalla en tres líneas distintas.
 Pista: Las cadenas de caracteres se almacenan en variables de tipo String.*/
public class DatosPersonales {
    static String nombre= "Pablo";
    static String direccion = "calle ejemplo 3";
    static String telefono ="+34 673759036";
    public static void main(String args[]){
        System.out.print(nombre + "\n" + direccion + "\n" + telefono);
    }
}

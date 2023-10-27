/* Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.
 */

package Guias.GuiaUno.PadawanJavaJedi;

public class PromedioDeEdad {
    public static void main(String[] args) {
        
        String nombre1 = "Juan"; 
        String nombre2 = "Juan2"; 
        String nombre3 = "Juanjo"; 
        
        int edad1 = 5;
        int edad2 = 20;
        int edad3 = 40;

        System.out.println("Nombre: " + nombre1 + ", Edad " + edad1);
        System.out.println("Nombre: " + nombre2 + ", Edad " + edad2);
        System.out.println("Nombre: " + nombre3 + ", Edad " + edad3);

        System.out.println("El promedio de las edades es: "+ (edad1 + edad2 + edad3)/3);


        


    }
}

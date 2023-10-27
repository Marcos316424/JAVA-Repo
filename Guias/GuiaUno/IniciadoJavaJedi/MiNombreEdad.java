/*Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
y apellido, luego guarde su edad e imprimalos por pantalla.
El mensaje debe tener el siguiente formato:
“Mi nombre es “ {Nombre}
“Mi edad es” {Edad}

*/

package Guias.GuiaUno.IniciadoJavaJedi;

public class MiNombreEdad {
    
    public static void main(String[] args) {
        
        String nombre = "Marcos";
        String apellido = "Eguiazabal";
        int edad = 28;

        System.out.println("Mi nombre es: " + nombre + " " + apellido);
        System.out.println("Mi edad es: " + edad);


    }
}

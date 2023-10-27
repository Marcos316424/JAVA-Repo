/*Guarda en un arreglo una N cantidad de amigos,
itere sobre esa cantidad mostrando el nombre de cada amigo si y sólo si este amigo
es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a
ese amigo porque no lo muestra por pantalla. Pero a su vez, encuentre al amigo que
mayor edad tenga, muestre un mensaje por pantalla del nombre de esa persona y su
edad.
 */

package Guias.GuiaDos.CaballeroJavaJedi;

public class MisAmigos {
    public static void main(String[] args) {
        
        int edad [] = {15, 12, 18, 15, 28};
        String nombre [] = {"Juan", "Carlos", "Eli", "Daniela", "Marcos"};

        int indiceMayor = 0;

        for (int i = 0; i< edad.length; i++){
            if (edad[i] >= 18){
                System.out.println(nombre[i] + " Es mayor de edad");
            }else{
                System.out.println(nombre[i] + " No es mayor de edad");
            }

            if (edad[i] > edad[indiceMayor]){
                indiceMayor = i;
            }
        }

        System.out.println("El amigo con mayor edad es: " + nombre[indiceMayor] + " tiene una edad de: " + edad[indiceMayor] + " años");
    }    
}

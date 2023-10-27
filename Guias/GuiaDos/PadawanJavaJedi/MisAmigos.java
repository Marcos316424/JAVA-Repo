/*Guarda en variables el nombre de N cantidad de amigos,
itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
diciendole a ese amigo porque no lo muestra por pantalla.
 */

package Guias.GuiaDos.PadawanJavaJedi;

public class MisAmigos {
    public static void main(String[] args) {
        
        String amigo1 = "Juan";   
        String amigo2 = "Pedro";
        String amigo3 = "Jose";

        int edad1 = 15;
        int edad2 = 18;
        int edad3 = 21;

        if (edad1>18){
            System.out.println(amigo1);
        }else{
            System.out.println(amigo1 + " No es mayor de edad");
        }
        if (edad2>18){
            System.out.println(amigo2);
        }else{
            System.out.println(amigo2 + " No es mayor de edad");
        }
        if (edad3>18){
            System.out.println(amigo3);
        }else{
            System.out.println(amigo3 + " No es mayor de edad");
        }
        


    }
}

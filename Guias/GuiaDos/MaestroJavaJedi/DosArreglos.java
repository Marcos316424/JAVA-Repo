/* Dado dos arreglos con cualquier tipo de valor (Ya sea
String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.
 */

package Guias.GuiaDos.MaestroJavaJedi;

public class DosArreglos {
    public static void main(String[] args) {
        
        char numero[] = { '5', '3', '1', '6', '4', '2', '7'};
        char letras[] = { 'A','B','C','D','E','F','G','H','J'};

        char [] salida = new char[numero.length + letras.length];

        for (int i = 0; i < numero.length; i++) {
            salida[i] = numero[i];
            salida[i + numero.length] = letras[i];            
        }

        for (int i = 0; i < salida.length; i++) {
            System.out.println(salida[i]);        
        }
    }
}

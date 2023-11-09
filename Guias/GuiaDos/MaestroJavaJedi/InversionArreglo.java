/*Dado un arreglo de enteros inviertalo, de tal manera que
el primer elemento ahora sea el último y así sucesivamente. */

package Guias.GuiaDos.MaestroJavaJedi;

public class InversionArreglo {
    public static void main(String[] args) {
        
        int numero[] = {5,3,1,6,4,2,7};

        int salida [] = new int[numero.length];

        
        for (int i = 0; i < salida.length; i++) {
            salida[i] = numero[(numero.length-1) - i];
        }

        for (int i = 0; i < salida.length; i++) {
            System.out.println(salida[i]);        
        }

    }
}

/* Dado un arreglo con valores enteros, realice la
búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre
por pantalla que no lo encontró.
 */


package Guias.GuiaDos.CaballeroJavaJedi;

import java.util.Scanner;

public class MayoresyMenores {
    public static void main(String[] args) {
        
        int numero [] = {1,2,3,4,5,6,7,8,9,10}; 

        Scanner intput = new Scanner(System.in);
        System.out.print("Ingrese el numero a buscar: ");
        int valor = intput.nextInt();

        boolean bandera = false;

        for (int i = 1; i< numero.length ; ++i){
            if (numero[i] == valor){
                bandera = true;
            }
        }

        if (bandera){
            System.out.println("El valor se encuentra en el arreglo: " + valor);
        }else{
            System.out.println("El valor no se encuentra en el arreglo: " + valor);
        }

        intput.close();
    }
}

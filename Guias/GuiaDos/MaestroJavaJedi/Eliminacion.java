/*Dado un arreglo con valores enteros, realice la
búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por
pantalla.
 */

package Guias.GuiaDos.MaestroJavaJedi;

import java.util.Scanner;

public class Eliminacion {
    public static void main(String[] args) {
        
        int numeros[] = { 5, 3, 1, 6, 4, 2, 7};

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el numero a buscar: ");
        int numero = input.nextInt();

        boolean bandera = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero){
                numeros[i] = 0;
                bandera = true;
            }
        }

        
        if (!bandera) {
            System.out.println("El numero no se encuentra en el arreglo");
        }else{
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]);
                
            }
        }
        input.close();

    }    
}

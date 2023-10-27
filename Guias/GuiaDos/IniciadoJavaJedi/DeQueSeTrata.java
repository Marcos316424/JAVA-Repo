/*Realizar un programa que guarde un número en memoria y
determine si es positivo, negativo o cero.
 */

package Guias.GuiaDos.IniciadoJavaJedi;

import java.util.Scanner;

public class DeQueSeTrata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = input.nextInt();
        
        if (numero == 0){
            System.out.println( "El numero es Cero");
        }else if (numero>0){
            System.out.println( "El numero es Positivo");
        }else{
            System.out.println( "El numero es Negativo");
        } 
        input.close();
    }
}

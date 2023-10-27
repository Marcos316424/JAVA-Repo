/*  Realizar un programa que guarde un número en memoria y
determine si es par o impar
*/

package Guias.GuiaDos.IniciadoJavaJedi;

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0){
            System.out.println( "El numero es par");
        }else{
            System.out.println( "El numero es impar");
        }

        input.close();
    }
}

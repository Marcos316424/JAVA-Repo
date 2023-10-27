/* : Realizar un programa que calcule el factorial de un número */

package Guias.GuiaDos.PadawanJavaJedi;

import java.util.Scanner;

public class ElFactorial {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        System.out.print("Ingrese numero a calcular el factorial: ");
        int numero = intput.nextInt();
        
        int resultado = 1;

        for (int i = 1; i<= numero; ++i){
            resultado *= i;
            
        }

        System.out.println("El factorial de: " + numero + ", es: " + resultado  );
        
        intput.close();
    }
}

/* Escribir un programa que encuentre la suma de los
números impares en un rango de números enteros guardados en una variable.
 */

package Guias.GuiaDos.PadawanJavaJedi;

import java.util.Scanner;

public class SumaDelRango {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero del rango: ");
        int numero1 = input.nextInt();
        System.out.print("Ingrese el segundo numero del rango: ");
        int numero2 = input.nextInt();

        int suma = 0;
        int sumaW = 0;
        //Solucion con un bucle For 
        for ( int i = numero1; i<= numero2; ++i){
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los numeros impares es: " + suma);

        //Solucion con un bucle While
        while (numero1 <= numero2){
            if (numero1 % 2 != 0) {
                sumaW += numero1;
            }
            numero1+=1;
        }
        System.out.println("La suma de los numeros impares es: " + sumaW);

        input.close();

    }
}

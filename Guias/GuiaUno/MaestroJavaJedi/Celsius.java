/*Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve.
 */

package Guias.GuiaUno.MaestroJavaJedi;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese los grados Celsius: ");
        double grados = input.nextDouble();

        double celcius = (grados * 1.8) + 32;

        System.out.printf("Los grados ingresados %.2f en Celsius corresponde a %.2f grados Fahrenheit \n" , grados, celcius);
    
        input.close();
    }
}

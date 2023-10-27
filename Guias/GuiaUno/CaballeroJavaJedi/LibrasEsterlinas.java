/*Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares.
 */

package Guias.GuiaUno.CaballeroJavaJedi;

import java.util.Scanner;

public class LibrasEsterlinas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en Libras Esterlinas: ");
        double libras = input.nextDouble();

        double tasaDeCambio = 1.22;
        double dolares = libras * tasaDeCambio;

        System.out.printf("%.2f Libras Esterlinas son %.2f Dólares.\n", libras, dolares);

        input.close();
    }
}

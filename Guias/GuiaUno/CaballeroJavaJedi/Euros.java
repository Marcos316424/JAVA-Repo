/*: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
 */

package Guias.GuiaUno.CaballeroJavaJedi;

import java.util.Scanner;

public class Euros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en Euros: ");
        double euros = input.nextDouble();

        double tasaDeCambio = 1.06;
        double dolares = euros * tasaDeCambio;

        System.out.printf("%.2f Euros son %.2f Dólares.\n", euros, dolares);

        input.close();

    }    
}

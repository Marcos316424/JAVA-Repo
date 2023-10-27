/*Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros.
 */


package Guias.GuiaUno.CaballeroJavaJedi;

import java.util.Scanner;

public class Pesos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en Pesos: ");
        double pesos = input.nextDouble();

        double tasaDeCambio = 0.0027;
        double euros = pesos * tasaDeCambio;

        System.out.printf("%.2f Pesos son %.2f Euros.\n", pesos, euros);

        input.close();

    }
}

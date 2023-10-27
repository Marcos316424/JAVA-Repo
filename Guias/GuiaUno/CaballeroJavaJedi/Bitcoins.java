/*Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares */

package Guias.GuiaUno.CaballeroJavaJedi;

import java.util.Scanner;

public class Bitcoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en Bitcoins: ");
        double bitcoins = input.nextDouble();

        double tasaDeCambio = 27635.24;
        double dolares = bitcoins * tasaDeCambio;

        System.out.printf("%.2f Bitcoins son %.2f Dólares.\n", bitcoins, dolares);

        input.close();
    }
}


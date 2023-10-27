/*: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */

package Guias.GuiaUno.CaballeroJavaJedi;

import java.util.Scanner;

public class Dolares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = input.nextDouble();

        double tasaDeCambio = 945.0;
        double pesos = dolares * tasaDeCambio;

        System.out.printf("%.2f dólares son %.2f pesos argentinos.\n", dolares, pesos);

        input.close();

    }

}

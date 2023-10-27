/* Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.
*/


package Guias.GuiaDos.IniciadoJavaJedi;

import java.util.Scanner;

public class Triangulo {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del triangulo: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; ++i) {
            for (int j = 1; j <= altura - i; ++j) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();
    }
}


/*Realizar un programa donde se guarde un número entero en una
variable y que imprima por pantalla el resultado de la suma de todos los números
enteros desde 1 hasta ese número.
 */

package Guias.GuiaDos.PadawanJavaJedi;

import java.util.Scanner;

public class MasSumas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = input.nextInt();

        int suma = 0;
        int contador = 1;

        while ( contador < numero){
            suma += contador;
            contador++;
        }
        System.out.println("La suma de los numeros es: " + suma);
        input.close();
    }
}

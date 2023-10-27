/*Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos. */

package Guias.GuiaUno.MaestroJavaJedi;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor del Cateto opuesto: ");
        double opu = input.nextDouble();
        System.out.print("Ingrese el valor del Cateto adyacente: ");
        double ady = input.nextDouble();

        double hipotenusa = Math.sqrt((opu * opu) + (ady * ady));
        
        System.out.printf("El valor de la hipotenusa del triangulo rectangulo con cateto opuesto: %.2f y cateto adyacente %2f es de: %.2f", opu, ady, hipotenusa);

        input.close();
    }    
}

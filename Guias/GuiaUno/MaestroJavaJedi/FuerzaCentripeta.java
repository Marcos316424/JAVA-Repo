/* Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
de la trayectoria.
Muestre el resultado por pantalla
*/

package Guias.GuiaUno.MaestroJavaJedi;

import java.util.Scanner;

public class FuerzaCentripeta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la Masa: ");
        double masa = input.nextDouble();
        System.out.print("Ingrese la velocidad angular: ");
        double velocidad = input.nextDouble(); 
        System.out.print("Ingrese el radio de la trayectoria: ");
        double radio = input.nextDouble(); 
        
        double fuerzaCentripeta = (masa * Math.pow(velocidad, 2)) / radio;
        
        System.out.printf("La fuerza centripeta necesaria para un cuerpo con masa= %.2f velocidad angular = %.2f y un radio= %.2f es de= %.2f", masa, velocidad, radio, fuerzaCentripeta);
        input.close();



    }
}

/*
Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido.
*/

package Guias.GuiaUno.MaestroJavaJedi;

import java.util.Scanner;

public class VelocidadFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la Velocidad inicial: ");
        double velocidadInicial = input.nextDouble();
        System.out.print("Ingrese el tiempo transcurrido: ");
        double tiempo = input.nextDouble();    

        final double GRAVEDAD = 9.8;

        double velocidadFinal = velocidadInicial + GRAVEDAD * tiempo;

        System.out.printf("La velocidad final del cuerpo con velocidad inicial= %.2f y un tiempo de caida= %.2f es de: %.2f", velocidadInicial, tiempo, velocidadFinal);

        input.close();

    }
    
}

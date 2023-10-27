/*Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla
*/

package Guias.GuiaUno.MaestroJavaJedi;

import java.util.Scanner;

public class EnergiaCinetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la masa del objeto: ");
        double masa = input.nextDouble();
        System.out.print("Ingrese la velocidad del objeto: ");
        double velocidad = input.nextDouble();

        double energia = (0.5) * masa * (velocidad*velocidad);
        System.out.printf("La energia cinetica de un objeto con masa= %.2f y velocidad= %.2f , la energia= %.2f", masa,velocidad,energia);

        input.close();

    }    
}

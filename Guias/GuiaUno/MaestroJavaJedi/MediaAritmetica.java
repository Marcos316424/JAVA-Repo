/*Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda.
Muestre el resultado por pantalla.
 */


package Guias.GuiaUno.MaestroJavaJedi;

public class MediaAritmetica {
    public static void main(String[] args) {
        
        int n1 = 5, n2 = 10, n3 = 15, n4 = 20, n5 = 25;
        final int k = 5;
        double media = (n1 + n2 + n3 + n4 + n5) / k;
        System.out.println("La media aritmética es: " + media);


    }
}

/*Dado un arreglo de enteros, una posición del
arreglo y la cantidad de N traslados a hacer en un arreglo. Lo que debe hacer es
tomar el elemento de la posición del arreglo y trasladarlo N cantidad de veces, si el
traslado es mayor al tamaño del arreglo informar por pantalla.

 * 
 */

package Guias.GuiaDos.MaestroJavaJedi;

public class TrasladarPocisiones {
    public static void main(String[] args) {
        
        int numero[] = { 5,3,1,6,4,2,7};

        int pos = 10;
        int traslado = 3;
        int valor = 0;

        if ((pos + traslado) < numero.length){
            valor = numero[pos + traslado];
            numero[pos + traslado] = numero[pos];
            numero[pos] = valor;

            for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);        
            }
        }else{
            System.out.println("Valor fuera de rango");
        }
    }
}

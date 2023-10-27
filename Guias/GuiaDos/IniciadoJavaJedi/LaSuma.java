/* Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria
 */
package Guias.GuiaDos.IniciadoJavaJedi;

public class LaSuma {
    public static void main(String[] args) {
        int numero = 4;
        int suma = 0;
        
        for (int i=1; i <= numero; ++i){
            suma += i;
        }
        System.out.print("La suma de los numeros naturales es: " + suma);
    }
}

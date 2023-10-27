/*Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.
 */

package Guias.GuiaDos.IniciadoJavaJedi;

public class LosApres {
    public static void main(String[] args) {
        final int N = 100;

        for (int i = 1; i<= N; ++i){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

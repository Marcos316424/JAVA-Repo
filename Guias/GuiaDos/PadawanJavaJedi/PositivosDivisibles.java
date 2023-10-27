/*  Realizar un programa que muestre por pantalla los
números enteros positivos que sean divisibles por 7 y que sean menores que 100.
*/

package Guias.GuiaDos.PadawanJavaJedi;

public class PositivosDivisibles {
    public static void main(String[] args) {
        
        System.out.print("Los numeros divisibles por 7 entre 1 y 100 son: ");
        for (int i= 1; i<100; ++i){
            if (i % 7 == 0 ){
                System.out.print(i);
                System.out.print(", ");

            }
        }
    }
}

/*  Cree dos arreglos con números decimales,
luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si
la resta da negativo entonces guarde 0.
*/

package Guias.GuiaDos.CaballeroJavaJedi;

public class ProhibidoMenores {
    public static void main(String[] args) {
        
        double numeros[] = { 5.5, 3.3, 1.1, 6.6, 4.4, 2.2, 7.7};
        double numeros2[] = { 4.3, 2.3, 2.1, 3.3, 1.8, 1.2, 8.9};
        
        double [] resultado = new double[numeros.length];

        for(int i= 0; i< resultado.length; ++i){
            if ( (numeros[i] - numeros2[i]) >= 0 ){
                resultado[i] = numeros[i] - numeros2[i];
            }else{
                resultado[i] = 0;
            }

            System.out.println(resultado[i]);
        }
        
    }
}

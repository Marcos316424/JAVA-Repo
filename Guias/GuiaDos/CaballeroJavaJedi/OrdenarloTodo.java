/* Realizar un programa que guarde cierta cantidad de números con
punto decimal en un arreglo. Luego, el programa debe ordenar los números de
forma ascendente y mostrarlos en pantalla */

package Guias.GuiaDos.CaballeroJavaJedi;

import java.util.ArrayList;

public class OrdenarloTodo {
    public static void main(String[] args) {
        
        double numeros[] = { 5.5, 3.3, 1.1, 6.6, 4.4, 2.2, 7.7};
        ArrayList<Double> ordenados = new ArrayList<Double>();
        double minimo = 0.0;
        double minimoAnterior = 0.0;

        for (int i = 0; i< numeros.length; i++){

            
            for (int j = 1; j< numeros.length; j++){
                if (i == 0){
                    minimo = numeros[j];
                    if (numeros[j] < minimo){
                        minimo = numeros[j];
                    }
                }else{
                    if (numeros[j] > minimo && numeros[j] > minimoAnterior){
                        minimo = numeros[j];
                }
            }

            minimoAnterior = minimo;
            ordenados.add(minimo);
            }
        }
        System.out.println(ordenados);

    }
}

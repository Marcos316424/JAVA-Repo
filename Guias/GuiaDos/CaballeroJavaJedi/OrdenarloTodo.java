/* Realizar un programa que guarde cierta cantidad de números con
punto decimal en un arreglo. Luego, el programa debe ordenar los números de
forma ascendente y mostrarlos en pantalla */

package Guias.GuiaDos.CaballeroJavaJedi;

public class OrdenarloTodo {
    public static void main(String[] args) {
        
        double numeros[] = { 5.5, 3.3, 1.1, 6.6, 4.4, 2.2, 7.7};
        double minimo = 0.0;
                
        for (int j =1; j<numeros.length; j++){
            minimo = numeros[0];
            for (int i =1; i<numeros.length; i++){
                if (numeros[i] < minimo ){
                    numeros[i -1] = numeros[i];
                    numeros[i] = minimo; 
                }else{
                    minimo = numeros[i];
                }
            }
        }
        
        for (int i =0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }   
    }
}


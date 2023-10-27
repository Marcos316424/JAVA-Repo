/* Realizar un programa donde se guarden 5 en
un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
de los números ingresados */


package Guias.GuiaDos.CaballeroJavaJedi;

public class MayoresyMenores2 {
    public static void main(String[] args) {
        
        int numero [] = {1,2,3,4,5,6,7,8,9,10};

        int maxValue = -2147483648;
        int minValue = 327671231;

        for (int i = 0; i< numero.length ; ++i){
            if (numero[i] > maxValue ){
                maxValue = numero[i];
            }
            
            if (numero[i] < minValue ){
                minValue = numero[i];
            }
        }

        System.out.println("El valor maximo encontrado es:" + maxValue);
        System.out.println("El valor minimo encontrado es:" + minValue);
    }
}

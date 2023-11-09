package QuintaClase.Arreglos;

public class Unidimensionales {
    public static void main(String[] args) {
        /*
         * Los arreglos son objetos, el new devuelve la referencia al espacio de memoria reservada
         * Los arreglos solo tienen componentes o valores del mismo tipo
         * Los arreglos se alojan contiguamenten en memoria
         * A partir de los indices (enteros no negativos) accedemos a los elementos del arreglo
         * Todo arreglo inicia desde el indice 0
         */
    
        int [] arr = {1,2,3,4,5,6};

        System.out.println("El tamaño del arreglo es: " + arr.length);
        System.out.println("El valor de la posicion 3 es: " + arr[2]);

        System.out.println("\n");

        int [] arr2 = new int[6];
        System.out.println("El tamaño del arreglo es: " + arr2.length);
        System.out.println("El valor de la posicion 3 es: " + arr2[2]);
        
        System.out.println("\n");
        boolean [] booleanos = new boolean[3];

        System.out.println("El valor 1 del arreglo de booleanos es: " + booleanos[0]);
        System.out.println("El valor 2 del arreglo de booleanos es: " + booleanos[1]);
        System.out.println("El valor 3 del arreglo de booleanos es: " + booleanos[2]);

        System.out.println("\n");

        for (int i= 0; i< booleanos.length; i++){
            System.out.println("El valor " + i + " del arreglo de booleanos es: " + booleanos[i]);
        }
    }
}

package QuintaClase.Arreglos;

public class EjerciciosEnClases {
    public static void main(String[] args) {
        
        /* Escribe un programa que tome como arrat y cree otro array que contenga solo los elementos del medio
         * es decir, eliminando el primer y ultimo elemento
         * 
         *  MyArray = [1,2,3,4]
         *  middle (myArray) = #[2,3]
         * 
         */

         int myArray [] = {1,2,3,4};

         if (myArray == null || myArray.length <= 2){

            //int resultado[] = new int[1];
            System.out.println("El arreglo es nulo de es de longitud menor o igual a dos");

         }else{
            int resultado[] = new int[myArray.length - 2];

            final int PRIMERA_POSICION = 0;
            final int ULTIMA_POSICION = myArray.length -1;

            for (int i = 0; i < myArray.length ; i++){
                if (i != PRIMERA_POSICION && i != ULTIMA_POSICION){
                    resultado[i-1] = myArray[i];
                }
            }
            System.out.println("El resultado final es: ");
            for ( int i = 0; i< resultado.length; i++){
                System.out.printf("Valor de la posicion [%d] = [%d] \n" ,i, resultado[i]);
            }

         }
    }
    
}

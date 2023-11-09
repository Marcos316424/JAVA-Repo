package QuintaClase.Arreglos;

public class EjercicioEnClase2 {
    public static void main(String[] args) {
        
        /* dado un array en 2D calcular la suma de sus elementos en diagonal
        * 
        * Array = {{1,2,3}{4,5,6}{7,8,9}}
        * 
        * sumar 1 + 5 + 9
        */
        
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        int suma = array[0][0] + array[1][1] + array[2][2];
        System.out.println("El resultado de la suma diagonal es: " + suma);

        int sumaDos = 0;

        for( int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i == j){
                    sumaDos += array[i][j];
                }
            }
        }
        System.out.println("El resultado de la suma diagonal con el bucle for es: " + sumaDos);


    }
}

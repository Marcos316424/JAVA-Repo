package TerceraClase.ProgramacionEstructurada.Iterarivas;

public class BucleFor {
    public static void main(String[] args) {
        
        // bucle for -> Conocemos la cantidad de veces que iteramos

        //Declaracion del indice int i = 1
        //Condicion del contador i <= 5
        //Incremento o Decremento del indice i++
        for(int i=1; i<= 5; i++){
            System.out.println("Hola Mundo");
        }

        boolean activador = false;

        for (int i = 1; !activador && i <= 5; i++){
            System.out.println("Hola Mundo bucle 2");
        }

        int j = 5;
        for (int i = 1; !activador && i <= 5; i++){
            while (j > 0){
                j--;
                System.out.println("Bucle While");
                if (j % 2 == 0){
                    System.out.println("Soy par");
                }
            }
            j = 5;
        }

        for (int i = 0; i < 10; i++){
            for (int k = 10; k > 0; i--){
                System.out.println("valor bucle 1: " + i + "valor bucle 2: " + k);
            }
        }

    }
}

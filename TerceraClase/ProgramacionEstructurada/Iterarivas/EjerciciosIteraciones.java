package TerceraClase.ProgramacionEstructurada.Iterarivas;

public class EjerciciosIteraciones {
    public static void main(String[] args) {
        // Dado n numeros indicar que numeros son primos desde 1 hasta n incluido

        int numeroN = 100;
        int numeroMin = 50;

        for (int i = numeroMin; i <= numeroN; i++){
            if (i <=2){
                if (i == 2){
                    System.out.println(i + " Es numero Primo");
                }else{
                    System.out.println(i + " Es un numero no primo");
                }
            }else{
                for (int j = 2; j <= (i-1); j++){
                    if (i % j == 0){
                        System.out.println(i + " Es un numero no primo");
                        break;
                    }else if (j == i-1){
                        System.out.println(i + " Es numero Primo");
                    }
                }
            }
        }
    }
}

package TerceraClase.ProgramacionEstructurada.Iterarivas;

public class MientrasIHacerMientras {
    public static void main(String[] args) {
        
        int contador = 1;
        //Bucle While ejecuta de 0 a N veces
        while (contador < 10){
            System.out.println("Hola! soy el numero: " + contador);
            contador++;
        }

        // Bucle do while ejecuta de 1 a N veces
        do{
            System.out.println("Adios soy el numero = " + contador);
        } while(contador<10);
    }
}

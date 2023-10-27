/*Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto
 */
package Guias.GuiaDos.IniciadoJavaJedi;

public class EsperoAprobar {
    public static void main(String[] args) {
        
        int nota1 = 6;
        int nota2 = 4;
        int nota3 = 5;
                
        System.out.println("Calculo de Aprobacion: ");
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);

        int suma = nota1 + nota2 + nota3;
        if ( suma / 3 >= 6){
            System.out.println("Aprobado");
        }else{
            System.out.println("Desaprobado");
        }
    }
}

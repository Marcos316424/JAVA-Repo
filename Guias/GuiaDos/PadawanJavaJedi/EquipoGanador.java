/*: Modifique el ejercicio anterior en donde usted debe
crear un menú de opciones en donde en ese menú de opciones debe elegir qué
equipo de fútbol quiere saber la información del el ejercicio 11.
 */


package Guias.GuiaDos.PadawanJavaJedi;

import java.util.Scanner;

public class EquipoGanador {
    public static void main(String[] args) {
        
        String equipo1 = "Equipo1";
        String equipo2 = "Equipo2";

        String entrenador1 = "Entrenador1";
        String entrenador2 = "Entrenador2";

        String jugador11 = "Jugador11";
        String jugador12 = "Jugador12";
        String jugador13 = "Jugador13";

        String jugador21 = "Jugador21";
        String jugador22 = "Jugador22";
        String jugador23 = "Jugador23";
        
        int opcion = 3;

        while (opcion != 1 && opcion !=2){

            Scanner input = new Scanner(System.in); 
            System.out.println("Selecione una opcion: ");
            System.out.println("1 - Para ver el equipo 1");
            System.out.println("2 - Para ver el equipo 2");
            System.out.print("Esperando opcion: ");
            opcion = input.nextInt();
            
            

            switch(opcion){
                case 1: 
                    
                    System.out.println("El nombre del Equipo 1 es: " + equipo1 );
                    System.out.println("Su Entrenador es: " + entrenador1);
                    System.out.println("Sus Jugadores son:");
                    System.out.println(jugador11 +", "+ jugador12 +", "+ jugador13);
                    break;
                case 2: 
                    System.out.println("El nombre del Equipo 2 es: " + equipo2 );
                    System.out.println("Su Entrenador es: " + entrenador2);
                    System.out.println("Sus Jugadores son:");
                    System.out.println(jugador21 +", "+ jugador22 +", "+ jugador23);
                    break;                
                default:
                    System.out.println();
                    System.out.println("Opcion Invalida");
                    System.out.println();
            }
            input.close();
        }
        
    }
}

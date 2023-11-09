/*
A partir del ejercicio número 12 del nivel de
Padawan Jedi mejorelo usando arreglos.
 */

package Guias.GuiaDos.MaestroJavaJedi;

import java.util.Scanner;

public class EquipoGanador {
    public static void main(String[] args) {
        
        String [] equipo1 = {"Equipo1","Entrenador1","Jugador11","Jugador12","Jugador13"};
        String [] equipo2 = {"Equipo2","Entrenador2","Jugador21","Jugador22","Jugador23"};
        
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
                    
                    System.out.println("El nombre del Equipo 1 es: " + equipo1[0] );
                    System.out.println("Su Entrenador es: " + equipo1[1]);
                    System.out.println("Sus Jugadores son:");
                    for (int i = 2; i < equipo1.length; i++) {
                        System.out.println(equipo1[i]);
                    }
                    
                    break;
                case 2: 
                    System.out.println("El nombre del Equipo 2 es: " + equipo2[0] );
                    System.out.println("Su Entrenador es: " + equipo2[1]);
                    System.out.println("Sus Jugadores son:");
                    for (int i = 2; i < equipo1.length; i++) {
                        System.out.println(equipo2[i]);
                    }
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

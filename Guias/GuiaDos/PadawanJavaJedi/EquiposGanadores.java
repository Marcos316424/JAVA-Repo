/*Guarde en variables el nombre de 2 equipos de fútbol,
luego en otras 2 variables el nombre de los entrenadores y luego guarde el nombre
de los jugadores en distintas variables. Luego muestre un encabezado con el
nombre de cada equipo y por cada equipo muestre los nombres de los jugadores.
 */

package Guias.GuiaDos.PadawanJavaJedi;

public class EquiposGanadores {
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
        
        System.out.println("El nombre del Equipo 1 es: " + equipo1 );
        System.out.println("Su Entrenador es: " + entrenador1);
        System.out.println("Sus Jugadores son:");
        System.out.println(jugador11 +", "+ jugador12 +", "+ jugador13);

        System.out.println();

        System.out.println("El nombre del Equipo 2 es: " + equipo2 );
        System.out.println("Su Entrenador es: " + entrenador2);
        System.out.println("Sus Jugadores son:");
        System.out.println(jugador21 +", "+ jugador22 +", "+ jugador23);



    }
}

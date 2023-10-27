/*Realice un menú de opciones con bucle WHILE, donde
la opción se guarde en una variable (Sin pedir por teclado), muestre la opción
elegida y fuerce su salida bucle */

package Guias.GuiaDos.PadawanJavaJedi;

public class MenuDeOpciones2 {
    public static void main(String[] args) {
        

        char opcion = 'B';

        while (opcion != 'S'){
            opcion = 'S';

            switch(opcion){
                case 'A': System.out.println("Opcion 1");
                    break;
                case 'B': System.out.println("Opcion 2");
                    break;
                case 'C': System.out.println("Opcion 3");
                    break;
                case 'D': System.out.println("Opcion 4");
                    break;
                case 'S': System.out.println("Opcion Salir");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        }


    }
}

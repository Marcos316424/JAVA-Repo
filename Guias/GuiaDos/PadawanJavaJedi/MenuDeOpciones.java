/* Realice un menú de opciones, donde la opción se guarde en
una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida
bucle.
 */


package Guias.GuiaDos.PadawanJavaJedi;

public class MenuDeOpciones {
    public static void main(String[] args) {
        
        char respuesta = 'S';
        do{
            switch(respuesta){
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
        }while (respuesta != 'S');
    }    
}

/* Dado un arreglo con caracteres (Formando una palabra) indicar
si es o no palíndromo. 
 */

package Guias.GuiaDos.MaestroJavaJedi;

public class SeraPalindromo {
    public static void main(String[] args) {
        char palabra[] = {'m','e','n','e','m'};

        boolean bandera = false;
        
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] != palabra[(palabra.length - 1) - i]){
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("La palabra es palindromo");
        }else{
            System.out.println("La palabra no es palindromo");
        }
    }
}

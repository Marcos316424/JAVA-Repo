/*
Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo
*/
package Guias.GuiaDos.IniciadoJavaJedi;

public class MisAmigos {
    public static void main(String[] args) {
        String[] amigos = new String[]{"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};

        for (int i = 0; i < amigos.length; i++) { 
            System.out.println(amigos[i]); 
        }
        
    }    
}

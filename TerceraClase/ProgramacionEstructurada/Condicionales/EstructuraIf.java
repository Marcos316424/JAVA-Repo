package TerceraClase.ProgramacionEstructurada.Condicionales;

public class EstructuraIf {
    public static void main(String[] args) {
        
        int topScore = 100;

        //Condicional simple
        if( topScore < 100 ){
            System.out.println("Top Score es menor a 100");
        }

        int secondScore = 78;

        if (topScore > secondScore && topScore <= 90){
            System.out.println(" Top Score es mayor a Second Score y es menor o igual a 90 ");
        }

        if (topScore > 90 || secondScore < 70){
            System.out.println("Se cumple que Top Score >90 || Second Score < 70");    
        }
        
    }
}

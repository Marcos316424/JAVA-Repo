package TerceraClase.ProgramacionEstructurada.Condicionales;

public class EstructuraElseIf {
    public static void main(String[] args) {
        
        boolean esUnDiaDeClases = true;
        final String DIA = "Viernes";

            //       if (esUnDiaDeClases ){
            //           System.out.println("Hoy es: " + DIA + " si hay clases");
            //       }else{
            //           System.out.println("Hoy es: " + DIA + " y no hay clases");
            //       }

        if (esUnDiaDeClases && DIA == "Lunes"){
            System.out.println("Hoy es: " + DIA + " y no hay clases");
        }else if(!esUnDiaDeClases){
            System.out.println("Hoy es: " + DIA + " y no hay clases");
        }else{
            System.out.println("Hoy es martes por lo que no hay informacion de las clases");
        }
    }
}

package TerceraClase.ProgramacionEstructurada.Condicionales;

public class SwitchCase {
    public static void main(String[] args) {
        
        int calificacion1 = 10;
        int calificacion2 = 5;

        switch((calificacion1 + calificacion2) / 2 ){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Desaprobaste");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Aprobado");
                break;
            default:
                System.out.println("Valor no valido");
                break;
        }

        System.out.println("Continuacion del Switch");
    }
}

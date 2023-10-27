/* Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla
*/


package Guias.GuiaUno.PadawanJavaJedi;

public class Conversion {
    
    public static void main(String[] args) {
        
        final double LIBRAS = 0.45;
        double peso = 264.555;

        double pesoK = LIBRAS * peso;

        System.out.println("Su peso en Kilogramos es: " + pesoK );


    }



}

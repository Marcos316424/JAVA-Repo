/*Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:
Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15 */


package Guias.GuiaUno.IniciadoJavaJedi;

public class Acumulador {
    public static void main(String[] args) {
        
        int numero1 = 8;
        int numero2 = 6;
        double acumulador = 0; 

        acumulador += (numero1*numero2)/1;
        acumulador += (numero1*numero2)/2;
        acumulador += (numero1*numero2)/3;
        acumulador += (numero1*numero2)/4;
        acumulador += (numero1*numero2)/5;
        acumulador += (numero1*numero2)/6;
        acumulador += (numero1*numero2)/7;
        acumulador += (numero1*numero2)/8;
        acumulador += (numero1*numero2)/9;
        acumulador += (numero1*numero2)/10;
        acumulador += (numero1*numero2)/11;
        acumulador += (numero1*numero2)/12;
        acumulador += (numero1*numero2)/13;
        acumulador += (numero1*numero2)/14;
        acumulador += (numero1*numero2)/15;

        System.out.println("El resultado es: " + acumulador);






    }
}

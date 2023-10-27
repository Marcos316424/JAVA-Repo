/* Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?
 */

package Guias.GuiaUno.IniciadoJavaJedi;

public class Multiplicacion {
    
    public static void main(String[] args) {
        
        double num3 = 4.5;
        double num4 = 9.5;
        double resultado = num3*num4;

        int num1 = 3;
        int num2 = 3;
        int resultado2 = num1*num2;

        double suma = resultado + resultado2;
        System.out.println("El resultado de la suma de las multiplicaciones es: " + suma);
    }
}

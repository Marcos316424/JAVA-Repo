/*: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado. */

package Guias.GuiaUno.IniciadoJavaJedi;

public class CalculoDivisibilidad {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int resultado = numero1 + numero2;

        String divisibilidad = (numero1 % numero1 == 0) ? "Es Divisible" : "No es Divisible";

        System.out.println("La suma de los numeros es "+ resultado + " El primer numero: "+ numero1 + " " + divisibilidad + " por el segundo numero: " + numero2);
        System.out.println("El resultado de la division entre los numeros es: " + (numero1/numero2));        

    }
    
}

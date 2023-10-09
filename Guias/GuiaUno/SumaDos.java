package Guias.GuiaUno;

public class SumaDos {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 3;
        int resultado = num1 +  num2;
        String paridad = (resultado % 2 == 0) ? "par" : "impar";
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + resultado + " y es numero: "+ paridad );
        
        

    }

}

package SegundaClase.ProgramacionImperativa.tipoDatos;

public class ByteShortLongAndWidt {
    public static void main(String[] args) {
        
        // Byte value - 8 bits - Clase wrapper
        System.out.println("Rango del valor del byte : " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        
        byte minValue = -128;
        byte maxValue = 127;

        System.out.println(minValue + maxValue);

        // short value - 16 bits - Clase wrapper
        System.out.println("Rango del valor short: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);

        short minValueShort = -32768;
        short maxValueShort = 32767;

        System.out.println( minValueShort + maxValueShort);

        //integer value - 32 bites - clase wrapper
        System.out.println("Rango del valor short: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        int minValueInt = -2147483648;
        int maxValueInt = 327671231;

        System.out.println(minValueInt + maxValueInt);

        //Tipo Long (es el doble de int)
        long valorLong = 3276712313L;

        // nomenclatura de tipo SCREAMING_SNAKE_CASE
        // declaracion de constante se usa el prefijo final 
        final long ESTA_ES_UNA_CONSTANTE = 3276712313L;

        System.out.println(valorLong + ESTA_ES_UNA_CONSTANTE);


    }
}

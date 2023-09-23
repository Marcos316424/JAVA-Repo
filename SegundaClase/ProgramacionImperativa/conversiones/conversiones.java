package SegundaClase.ProgramacionImperativa.conversiones;

public class conversiones {

    public static void main(String[] args) {
        
        //conversion de tipo promocion
        int value1 = 5;

        //conversion de tipo contraccion
        int value2 = (int)5.50f; //Cast

        //conversion de tipo implicita
        double value3 = 10 + 20.5d;
        System.out.println(value3);

        System.out.println(value1 + value2);


    }
    
}

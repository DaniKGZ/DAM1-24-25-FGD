package ud1;


/*
 * Daniel Fernandez Garcia, DAM1 24-25
 */

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        double largo, ancho, radio, largoRec; //largoRec equivale al largo del rectángulo una vez se suprime el círculo.
        double areaRec, areaCir, perRec, perCir; //areaRec y perRec equivalen a las area y perimetro del rectangulo respectivamente. El mismo caso que para areaCir y perCir.
        double area, perimetro, resto, vueltas; //area y perimetro son las sumas de las areas y perimetros de ambas figuras. vueltas es el total de vueltas que se deben dar para
        final double MARATON =21079;      //completar la media maraton y resto son los metros adicionales que habran para completar la ultima vuelta.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el largo de la pista!"); //Obtenemos las medidas de la pista
        largo = sc.nextFloat();
        System.out.println("Introduce el ancho de la pista!");
        ancho = sc.nextFloat();
        sc.close();

        radio=ancho/2;
        largoRec= largo-ancho; //obtenemos los valores del radio del círculo y el largo del rectángulo
        //areas
        areaRec= largoRec*ancho;
        areaCir=Math.pow(Math.PI*radio,2);
        //perimetros
        perRec= 2*largoRec + 2*ancho;
        perCir= 2*Math.PI*radio;
        //totales
        area=areaRec+areaCir;
        perimetro=perRec+perCir;

        vueltas = MARATON / perimetro; //Calculamos el total de vueltas dividiendo la distancia de la media maraton entre el perimetro
        resto = MARATON - ((int)vueltas * perimetro); // calculamos cuanta distancia sobra. para esto casteamos vueltas a una integral, pues
                                                      // MARATON = perimetro*vueltas por lo cual de otra manera daria 0. ademas, vueltas es un numero entero en la practica.
        System.out.printf("- El area de la pista es de %.0f m^2.\n- El perimetro de la misma es de %.0f m.\n", area, perimetro);
        System.out.printf("- Se daran un total de %.0f vueltas.\n- En la ultima vuelta sobraran %.0f metros para el final.",vueltas, resto);
        
    }
}

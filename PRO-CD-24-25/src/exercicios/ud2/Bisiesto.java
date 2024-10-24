package exercicios.ud2;

import java.util.Scanner;

/*Haz un programa que pida por teclado un número de año y que
muestre un mensaje indicando si el año es bisiesto o no.
Investiga el agoritmo para calcular si un año es bisiesto o no.
“Año bisiesto es el divisible entre 4, salvo que sea año secular es decir divisible por 100, en cuyo
caso también ha de ser divisible entre 400.” */

public class Bisiesto {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un año y te digo si es bisiesto");
        year = sc.nextInt();
        sc.close();
        
        if (year%100==0) {
            if (year%400==0) {
            System.out.println("El año "+year+ " es año bisiesto y secular!");
        } else {System.out.println("El año "+year+" no es año bisiesto, pero si secular!");}
        } else if (year%4==0) {System.out.println("El año "+year+ " es año bisiesto!");
        } else{System.out.println("El año "+year+ " no es año bisiesto");}
    }
}

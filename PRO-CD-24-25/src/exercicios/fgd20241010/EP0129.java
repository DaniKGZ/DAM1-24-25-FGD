/*
 * Escribe un programa que tome como entrada un número entero e indique qué
cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7.
A 13 hay que sumarle 1 para que el resultado (13+1=14) sea múltiplo de 7.
Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1,
respectivamente.
Pista: El operador módulo puede ser muy útil para solucionar esta actividad
 * 
 * 
 */



package exercicios.fgd20241010;

import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {
        
        int respuesta, entrada;
        final int DIVIDENDO = 7;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número y te contestaré cuanto tienes que sumarle para convertirlo en multiplo de "+DIVIDENDO+".");
        entrada = sc.nextInt();
        sc.close();

        respuesta = DIVIDENDO - (entrada % DIVIDENDO);

        System.out.printf("Al numero %d le falta sumarle %d para hacerlo multiplo de %d.", entrada, respuesta, DIVIDENDO);
        

    }
}

package ud1.fgdexamen;

/*
 * Daniel Fernandez Garcia, DAM1 24-25
 */

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        
        double am1, am2, am3; //La cantidad que aporta cada uno de los amigos(am)
        double boteRestante, total, precio; //boteRestante actua como bote en caso de tener dinero de mas, y como lo que falta en caso de tener dinero de menos.
        Scanner sc = new Scanner(System.in);
        String respuesta;

        System.out.println("¿Cuanto cuesta el producto?");  //Obtenemos el precio
        precio = sc.nextDouble();
        System.out.println("Indica la cantidad que aportara el primer amigo.");     //Obtenemos la cantidad que aportara cada uno de los miembros.
        am1 = sc.nextDouble();
        System.out.println("Indica la cantidad que aportara el Segundo amigo.");
        am2 = sc.nextDouble();
        System.out.println("Indica la cantidad que aportara el tercer amigo.");
        am3 = sc.nextDouble();
        sc.close();

        total = am1 + am2 + am3;
        boteRestante = total>precio? total-precio : precio-total;  //A traves de un operador ternario comparamos si el total mayor, igual o menor que el
                                                                   //precio del producto a comprar.

        respuesta = total < precio ? "No tienes suficiente! Os faltan %.2f euros!"  
        : total == precio ? "Felicidades! teneis lo justo para realizar la compra!" 
        : "Teneis demasiado! Os sobran %.2f euros para el bote!";
        
        System.out.printf(respuesta, boteRestante); //Imprimimos el resultado
    }
}

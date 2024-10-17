package exercicios.fgd20241010;

import java.util.Scanner;

public class EP0133_ConversionAlmacenamientoDatos {
    public static void main(String[] args) {
        double entrada, salida;
        int selector1, selector2;
        final double OPERADOR = 1000;
        String unidad;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame la cantidad que quieres convertir.");
        entrada = sc.nextDouble();
        System.out.println("Dime la unidad de origen (0 - KB / 1 - MB / 2 - GB)");
        selector1 = sc.nextInt();
        System.out.println("Dime la unidad de destino (0 - KB / 1 - MB / 2 - GB)");
        selector2 = sc.nextInt();
        sc.close();

        entrada = selector1 < 1? entrada/OPERADOR
        : selector1 == 1 ? entrada
        : entrada*OPERADOR;

        salida= selector2 < 1? entrada*OPERADOR
        : selector2 == 1 ? entrada
        : entrada/OPERADOR;
        
        unidad = selector2 <1? "KB" : (selector2 == 1? "MB": "GB");

        System.out.println("El resultado son "+salida+" "+unidad+"s");

        /*salida = selector1 < 1 ? (selector2 < 1? (entrada)) : ((selector2 == 1? (entrada*OPERADOR) : (entrada*OPERADOR*OPERADOR) )) : (selector1 == 1? (selector2 <1? (entrada/OPERADOR)) : (selector2 == 1? entrada : entrada*OPERADOR)) : ((selector1 > 1? (selector2 < 1 ? (entrada/OPERADOR/OPERADOR)) : (selector2 == 1? entrada/OPERADOR : entrada));*/
        
    }
}

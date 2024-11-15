package exercicios.UD2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {

    public static double productos() {
        double costProd=0, total = 0;
        int cantidad = 1;
        Boolean isInOk= false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Precio actual: " + total);
            System.out.println("Introduce el coste de tu producto. (0 para terminar de introducir los productos)");
            
            do {
                isInOk = true;
                try {
                    costProd = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero, por favor");
                    isInOk = false;
                }
            } while (isInOk==false);

            if (costProd > 0) {
                System.out.println("Introduce la cantidad de productos.");
                
            }
            
            
            if (cantidad > 0) {
                total = total + (costProd * cantidad);
                total = (Math.floor(total * 100))/100;
            } else {
                System.out.println("Error en la cantidad. vuelve a intentarlo. (introduce un numero entero mayor que 0)");
            }
        } while (costProd > 0);
        return total;
    }

    public static Boolean eleccionMetodo() {
        String metodoPago;
        Boolean efectivo, isInOk = true;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Cual será su metodo de pago?\n\nE/e - Efectivo.\n\nT/t - Tarjeta\n\n");
        for (int i=1;i<31;i++) {
            System.out.print("-");
        }
        System.out.println("\n");
        metodoPago=sc.nextLine();
            switch (metodoPago) {
                case "e":
                case "E":
                    efectivo=true;
                    isInOk=true;
                    break;
                case "t":
                case "T":
                    efectivo=false;
                    isInOk=true;
                    break;
                default:
                efectivo=true;
                isInOk=false;
                System.out.println("Introduce una de las opciones validas!\n");
                    break;
            }
        } while (isInOk=false);
        return efectivo;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido, cliente! procederemos a realizar el cobro.");
        System.out.println("El coste total es " + productos());
        if (eleccionMetodo()==true) {
            System.out.println("Efectivo");
        } else {System.out.println("Tarjeta");}
    }

    public static void efectivo(input) {
        final int CINCO = 5, DIEZ = 10, VEINTE = 20, CINCUENTA = 50;
        if (input>=CINCUENTA) {

        } else if(input>=VEINTE) {

        } else if(input>=DIEZ) {
            
        } else if (input>=CINCO) {

        } else if (input>=1)
    }
}

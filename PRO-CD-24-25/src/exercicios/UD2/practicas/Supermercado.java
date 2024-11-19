package exercicios.UD2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {

    public static double productos() {
        double costProd = 0, total = 0;
        int cantidad = 1;
        Boolean isInOk = false;
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
                    sc.nextLine();
                }
            } while (isInOk == false);

            if (costProd > 0) {
                System.out.println("Introduce la cantidad de productos.");
                cantidad = sc.nextInt();
            }

            if (cantidad > 0) {
                total = total + (costProd * cantidad);
                total = (Math.floor(total * 100)) / 100;
            } else {
                System.out
                        .println("Error en la cantidad. vuelve a intentarlo. (introduce un numero entero mayor que 0)");
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
            for (int i = 1; i < 31; i++) {
                System.out.print("-");
            }
            System.out.println("\n");
            metodoPago = sc.nextLine();
            switch (metodoPago) {
                case "e":
                case "E":
                    efectivo = true;
                    isInOk = true;
                    break;
                case "t":
                case "T":
                    efectivo = false;
                    isInOk = true;
                    break;
                default:
                    efectivo = true;
                    isInOk = false;
                    System.out.println("Introduce una de las opciones validas!\n");
                    break;
            }
        } while (isInOk = false);
        return efectivo;
    }

 

    public static void efectivo(double input, double cost) {

     
        
        final int CINCO = 5, DIEZ = 10, VEINTE = 20, CINCUENTA = 50;
        double cambio;
        int cincos=0, dieces=0, veintes=0, cincuentas=0, unos=0, cents=0, inEur, inCent;
        Boolean finCambio = false;
        cambio = input - cost;
        System.out.println(cambio);
        inEur = (int) Math.floor(cambio);
        inCent = (int) (cambio - inEur)*100;
        System.out.printf("%f %f %d %d %d %d %d %d ",input, cost, cincuentas, veintes, dieces, cincos, inEur, inCent);
        while (finCambio=false) {
            if (inEur>=CINCUENTA) {
                cincuentas = inEur/CINCUENTA;
                inEur = inEur-(cincuentas * CINCUENTA);
            } else if(inEur>=VEINTE) {
                veintes=inEur/VEINTE;
                inEur=inEur-(veintes * VEINTE);
            } else if(inEur>=DIEZ) {
                dieces= inEur/DIEZ;
                inEur = inEur-(dieces*DIEZ);
            } else if (inEur>=CINCO) {
                cincos = inEur/CINCO;
                inEur = inEur - (cincos*CINCO);
            } else {unos=inEur;
            finCambio=true;}            
        }


        cents = inCent;
        System.out.printf("%d %d %d %d %d %d", cincuentas, veintes, dieces, cincos, unos, cents);
        System.out.printf("Tu cambio es de: %d %d %d %d %d %d ", cincuentas, veintes, dieces, cincos, unos, cents);
        if (cincuentas > 0) {System.out.println("BILLETES DE 50: "+ cincuentas);}
        if (veintes > 0) {System.out.println("BILLETES DE 50: "+ veintes);}
        if ( dieces> 0) {System.out.println("BILLETES DE 50: "+ dieces);}
        if (cincos > 0) {System.out.println("BILLETES DE 50: "+ cincos);}
        if (unos > 0) {System.out.println("BILLETES DE 50: "+ unos);}
        if (cents > 0) {System.out.println("BILLETES DE 50: "+ cents);}
        
    }
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double costeTotal, pago;
    Boolean error= false;
        System.out.println("Bienvenido, cliente! procederemos a realizar el cobro.");
        costeTotal = productos();
        System.out.println("El coste total es " + costeTotal);
        if (eleccionMetodo()==true) {
            System.out.println("Introduce la cantidad a pagar.  ||  Precio: "+costeTotal+" €.");
            do {
                pago = sc.nextDouble();
                if (pago>costeTotal) {
                    error=false;
                    System.out.println(error);
                } else {System.out.println("El pago debe ser superior al coste.");
                    error=true;}
            } while (error==true);
            efectivo(pago ,costeTotal);
        } else {System.out.println("Gracias por venir!");}
   }

}
package exercicios.UD2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;
@SuppressWarnings("resource")

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
                do {
                    System.out.println("Introduce la cantidad de productos.");
                    isInOk = true;
                try {
                    cantidad = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero, por favor");
                    isInOk = false;
                    sc.nextLine();
                }
                } while (isInOk == false);
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

        
            System.out.println("Cual será su metodo de pago?\n\nE/e - Efectivo.\n\nT/t - Tarjeta\n\n");
            for (int i = 1; i < 31; i++) {
                System.out.print("-");
            }
            System.out.println("\n");
        do {
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
                    System.out.println("Introduce una de las opciones validas! [E / T]\n");
                    break;
            }
        } while (isInOk == false);
        return efectivo;
    }

    public static void efectivo(double input, double cost) {

        final int CINCO = 5, DIEZ = 10, VEINTE = 20, CINCUENTA = 50;
        double cambio;
        int cincos = 0, dieces = 0, veintes = 0, cincuentas = 0, unos = 0, cents = 0, inEur, inCent;
        Boolean finCambio = false;
        cambio = input - cost;
        inEur = (int) cambio;
        inCent = (int) ((cambio - inEur + 0.00001) * 100);

        do {
            if (inEur >= CINCUENTA) {
                cincuentas = inEur / CINCUENTA;
                inEur = inEur - (cincuentas * CINCUENTA);
            } else if (inEur >= VEINTE) {
                veintes = inEur / VEINTE;
                inEur = inEur - (veintes * VEINTE);
            } else if (inEur >= DIEZ) {
                dieces = inEur / DIEZ;
                inEur = inEur - (dieces * DIEZ);
            } else if (inEur >= CINCO) {
                cincos = inEur / CINCO;
                inEur = inEur - (cincos * CINCO);
            } else {
                unos = inEur;
                finCambio = true;
            }
        } while (finCambio == false);

        cents = inCent;
        System.out.println("Tu cambio es de:");
        if (cincuentas > 0) {
            System.out.println("BILLETES DE 50: " + cincuentas);
        }
        if (veintes > 0) {
            System.out.println("BILLETES DE 20: " + veintes);
        }
        if (dieces > 0) {
            System.out.println("BILLETES DE 10: " + dieces);
        }
        if (cincos > 0) {
            System.out.println("BILLETES DE 5: " + cincos);
        }
        if (unos > 0) {
            System.out.println("MONEDAS DE EURO: " + unos);
        }
        if (cents > 0) {
            System.out.println("MONEDAS DE CENTIMO: " + cents);
        }
    }

    public static double tryCatchDouble(double input) {
        Scanner sc = new Scanner(System.in);
        Boolean isInOk;
        do {
            isInOk = true;
            try {
                input = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido! Vuelve a intentarlo.\n");
                isInOk=false;
                sc.nextLine();
            }
        } while (isInOk==false);
        System.out.println(input);
        return input;
    }


   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String nuevoCobro;
    double costeTotal, pago=0;
    Boolean error= false, seguir=false, errorFin=false;
        do {
                System.out.println("Bienvenido, cliente! procederemos a realizar el cobro.");
            costeTotal = productos();
            System.out.println("El coste total es " + costeTotal);
            if (eleccionMetodo()==true) {
                System.out.println("Introduce la cantidad a pagar.  ||  Precio: "+costeTotal+" €.");
                do {    
                    pago = tryCatchDouble(pago);
                    System.out.println(pago);
                    if (pago>costeTotal) {
                        error=false;

                    } else {System.out.println("El pago debe ser superior al coste.");
                        error=true;}
                } while (error==true);
                efectivo(pago ,costeTotal);
            } else {System.out.println("Gracias por venir!");}
            System.out.println("Quieres realizar otro cobro? [S / N]");
                do {
                    errorFin=false;
                    nuevoCobro = sc.nextLine();
                    switch (nuevoCobro) {
                        case "S":
                        case "s":
                            seguir=true;
                            System.out.println("\n\n");
                            break;
                        case "n":
                        case "N":
                            seguir=false;
                            break;
                        default:
                            System.out.println("Introduce una S o una N por favor.\n\n");
                            errorFin=true;
                            break;
                        }
                    } while (errorFin==true);
            } while (seguir==true); 
        System.out.println("\nGracias por usar nuestros servicios.");

    }

}
    
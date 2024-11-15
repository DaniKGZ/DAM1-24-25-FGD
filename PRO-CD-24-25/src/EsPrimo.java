import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        int input;
        Boolean esPrimo=true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero y te dire si es primo.");
        input = sc.nextInt();
        sc.close();
        for(int i=(input-1); i>1; i--) {
            if (input%i==0) {
                esPrimo = false;
            }
        }
        System.out.println(esPrimo);
    }
}

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        int lado;
        Scanner sc = new Scanner(System.in);


        System.out.println("Como de largo es el lado de tu triangulo");
        lado= sc.nextInt();
        sc.close();

        for(int i=1; i<=lado; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("$ ");
            }
            System.out.printf("\n");
        }
    }
}

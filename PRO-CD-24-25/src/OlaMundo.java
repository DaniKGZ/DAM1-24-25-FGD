import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);


        System.out.println("Dame un texto.");
        input = sc.nextLine();
        System.out.println("Dame un simbolo");
        char sym = sc.nextLine().charAt(0);
        sc.close();
        System.out.println("\n");
        textChar(input, sym);
        textBox(input, sym);
        textChar(input, sym);

    }

    public static void textBox(String str, char symbol) {
        System.out.printf("\n%c-%s-%c\n", symbol, str, symbol);
    }

    public static void textChar(String str, char symbol) {
        int len=str.length();
        for(int i=1; i <= len + 4; i++) {
            System.out.print(symbol);
        }
    }
}

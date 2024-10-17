package exercicios;

import java.util.Scanner;

public class EP0126 {
   /*EP0131. La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una
competición donde cada participante escribe un algoritmo en un papel y lo lanza, ganando
quien consiga lanzarlo más lejos. La peculiaridad del concurso es que la longitud del
lanzamiento se mide en metros (con tantos decimales como se desee), pero para el ranking
solo se tiene en cuenta la longitud en centimetros (sin decimales). Por ejemplo, para un
lanzamiento de 12,3456 m (que son 1234,56 cm) solo se contabilizarán 1234 cm.
*/

    public static void main(String[] args) {
        double metros;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la distancia en metros");
        metros = sc.nextDouble();
        sc.close();
        metros = metros*100;
        System.out.printf("El total en cms es de %.0f cms", metros);

    }
}

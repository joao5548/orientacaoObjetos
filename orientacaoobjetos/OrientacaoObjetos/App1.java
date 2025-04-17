
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Classe1 ex1 = new Classe1();

        System.out.println("Digite a n1: ");
        ex1.n1 = teclado.nextFloat();

        System.out.println("Digite a n1: ");
        ex1.n2 = teclado.nextFloat();

        ex1.media = (ex1.n1 + ex1.n2)/2;
        System.out.println("A média é: " + ex1.media);

    }
}

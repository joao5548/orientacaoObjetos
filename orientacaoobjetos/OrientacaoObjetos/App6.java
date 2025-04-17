
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        //VOLUME = COMPRIMENTO * LARGURA * ALTURA
        Scanner teclado = new Scanner(System.in);

        Classe1 ex6 = new Classe1();

        System.out.println("Digite o comprimento: ");
        ex6.comprimento = teclado.nextFloat();

        System.out.println("Digite a largura: ");
        ex6.largura = teclado.nextFloat();

        System.out.println("Digite a altura: ");
        ex6.altura = teclado.nextFloat();

        ex6.volume = ex6.comprimento * ex6.largura * ex6.altura;
        System.out.println("O volume é: " + ex6.volume);
    }
}

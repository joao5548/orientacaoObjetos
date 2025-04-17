
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Classe1 ex2 = new Classe1();
        
        System.out.println("Digite a base: ");
        ex2.base = teclado.nextFloat();
        
        System.out.println("Digite a altura: ");
        ex2.altura = teclado.nextFloat();

        ex2.area = (ex2.base * ex2.altura)/2;
        System.out.println("A area é: " + ex2.base);


    }
}

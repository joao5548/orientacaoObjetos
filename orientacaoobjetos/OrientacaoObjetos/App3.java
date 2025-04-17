
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Classe1 ex3 = new Classe1();

        System.out.println("Digite o salario bruto: ");
        ex3.salarioBruto = teclado.nextFloat();

        ex3.salarioLiquido = (float)(ex3.salarioBruto*0.9*0.7);
        System.out.println("O salario liquido é: " + ex3.salarioLiquido);
        


    }
}


import java.util.Scanner;

public class App7 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Classe1 ex7 = new Classe1();

    System.out.println("Digite o salario bruto: ");
    ex7.salarioBruto = teclado.nextFloat();

    ex7.salarioLiquido = (float)(ex7.salarioBruto*1.20*0.93);
    System.out.println("O salario liquido é: " + ex7.salarioLiquido);



}
}

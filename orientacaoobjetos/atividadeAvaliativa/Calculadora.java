
import java.util.Scanner;

public class Calculadora {
    
    public double somar;
    public double subtrair;
    public double a;
    public double b;
    public int opcao;
    public int valor;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        switch (opcao) {
            case 1:
                System.out.println("digite o numero a: ");
                this.a = teclado.nextDouble();
                System.out.println("Digite o b: ");
                this.b = teclado.nextDouble();
                valor = this.a + this.b;
                break;
            default:
                throw new AssertionError();
        }
    }



}


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
        System.out.println("Digite 1 para subtrair");
        this.a = teclado.nextDouble();
        System.out.println("Digite 2 para somar"); 
        switch (opcao) {
            case 1:
                System.out.println("digite o numero a: ");
                this.a = teclado.nextDouble();
                System.out.println("Digite o b: ");
                this.b = teclado.nextDouble();
                break;
            default:
                
        }
    }



}


import java.util.Scanner;

public class MetodoRetornoParametro {
    
    public String carro;
    public int velocidade;

    //metodo com parametro
    int turboCarro(int turbo){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do carro: ");
        this.carro = teclado.nextLine();
        System.out.println("Digite a velocidade: ");
        this.velocidade = teclado.nextInt();

        int velocidadeTotal = (this.velocidade + turbo);
        System.out.println("velocidade Total: " + velocidadeTotal);

        return velocidadeTotal;
    }

}

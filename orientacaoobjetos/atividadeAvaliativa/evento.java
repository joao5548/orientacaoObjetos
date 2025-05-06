
import java.util.Scanner;

public class evento {
    
    public String nomeEvento;
    public int capacidadeMaxima;
    public int pessoaConfirmada;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual o nome do evento: ");
        this.nomeEvento = teclado.nextLine();
        System.out.println("qual a capacidade maxima: ");
        this.capacidadeMaxima = teclado.nextInt();
        System.out.println("Quantas pessoas confirmadas: ");
        this.pessoaConfirmada = teclado.nextInt();
    }
    void verificarLotacao(){
        if (this.pessoaConfirmada>= this.capacidadeMaxima) {
            System.out.println("Esta lotado");
        }else{
            System.out.println("Dentro da capacidade");
        }
    }

}

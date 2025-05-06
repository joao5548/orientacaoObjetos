
import java.util.Scanner;

public class banco {
    
    public String nome;
    public double saldo;
    public double transferencia;  
    public float  conta;

    void lerDadoss(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite o saldo: ");
        this.saldo = teclado.nextDouble();
        System.out.println("qual o valor que deseja tranferir: ");
        this.transferencia = teclado.nextDouble();
        System.out.println("Digite a conta que deseja transferir: ");
        this.conta = teclado.nextFloat();
        if (this.saldo>= this.transferencia) {
            System.out.println("podera tranferir");
        }else{
            System.out.println("não podera transferir");
        }

    }

}

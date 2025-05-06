
import java.util.Scanner;

public class classePessoa {
    
    public String nome;
    public int idade;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        this.idade = teclado.nextInt();
    }
    void exibir(){
        System.out.println("nome: " + this.nome + "idade é: " + this.idade);
    }

}

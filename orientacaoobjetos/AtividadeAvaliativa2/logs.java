
import java.util.Scanner;

public class logs {
    public String nome;
    public String login;
    public String senha;

    void exibir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite seu login: ");
        this.login = teclado.nextLine();
        System.out.println("Digite sua senha: ");
        this.senha = teclado.nextLine();
    }
}

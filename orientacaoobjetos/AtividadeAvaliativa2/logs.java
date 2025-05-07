
import java.util.Scanner;

public class logs {
    public String nome = "João";
    public String login = "joao";
    public String senha = "123";

    void lerDadoss(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite seu login: ");
        this.login = teclado.nextLine();
        System.out.println("Digite sua senha: ");
        this.senha = teclado.nextLine();
    }
    void exibir(){
        if (login.equals(this.login) && senha.equals(this.senha)) {
            System.out.println("Login correto");
        }else{
            System.out.println("login incorreto");
        }
    }

}

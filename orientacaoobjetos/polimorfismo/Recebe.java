
import java.util.Scanner;

public class Recebe extends Pessoa3 implements EntradaDados {

    @Override
    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite seu Email: ");
        this.email = teclado.nextLine();

        System.out.println("Nome: " + this.nome + " Email: " + this.email);
    }
    
    

}

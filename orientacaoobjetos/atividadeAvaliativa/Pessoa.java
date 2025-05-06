
import java.util.Scanner;

public class Pessoa {
    
    public String nome;

    void lerNome(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome = teclado.nextLine();
    }

}

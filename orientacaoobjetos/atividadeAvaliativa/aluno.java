
import java.util.Scanner;

public class aluno extends Pessoa{
    
    public String curso;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite o curso: ");
        this.curso = teclado.nextLine();
    }
    void exibir(){
        System.out.println(this.nome + " " + this.curso);
    }

}

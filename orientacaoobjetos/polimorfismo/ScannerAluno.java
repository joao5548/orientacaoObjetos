
import java.util.Scanner;

public class ScannerAluno extends aluno222 implements EntradaDados {

    @Override
    public void lerDados() {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o nome: ");
       this.nome = teclado.nextLine();
       System.out.println("Digite a nota: ");
       this.nota = teclado.nextFloat();

       System.out.println("nome: " + this.nome + " Nota: " + this.nota);
    }
    
    

}

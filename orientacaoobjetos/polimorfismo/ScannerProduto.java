
import java.util.Scanner;

public class ScannerProduto extends Produto111 implements EntradaDados {

    @Override
    public void lerDados() {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o nome do produto: ");
       this.nome = teclado.nextLine();
       System.out.println("Qual o preço: ");
       this.preco = teclado.nextFloat();

       System.out.println("nome: " + this.nome + " preço: " + this.preco);
    }
    
    

}

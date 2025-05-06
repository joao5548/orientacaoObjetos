
import java.util.Scanner;

public class Produto {
    
    public String nome;
    public double preco;
    public String categoria;
    public double estoque = 100;

    void borracha(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite o preço: ");
        this.preco = teclado.nextDouble();
        System.out.println("Digite a categoria: ");
        this.categoria = teclado.nextLine();
        


    }


}

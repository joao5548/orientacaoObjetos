
import java.util.Scanner;

public class Produto {
    
    public String nome;
    public double preco;
    public String categoria;
    public double estoque;
    public int qnt;

    void borracha(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite o preço: ");
        this.preco = teclado.nextDouble();
        System.out.println("Digite a categoria: ");
        this.categoria = teclado.nextLine();
        System.out.println("estoque");
        this.estoque = teclado.nextInt();
        System.out.println("Digite a quantidade para adicionar ao estoque: ");
        this.qnt = teclado.nextInt();

        this.estoque += this.qnt;
        
        System.out.println("\nProduto: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Estoque atualizado: " + this.estoque); 


    }


}

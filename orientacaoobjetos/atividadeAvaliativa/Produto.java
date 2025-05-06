
import java.util.Scanner;

public class Produto {
    
    public String nome;
    public float preco;

    void cadastrar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = teclado.nextLine();
         
        System.out.println("Digite sua idade: ");
        this.preco = teclado.nextInt();

       
        

    }


    void exibirPoduto(){
        System.out.println(this.nome+this.preco);
    }



}


import java.util.Scanner;

public class compras {
    public String nome;
    public double preco;

    void joaoo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite o preco");
        this.preco = teclado.nextFloat();
        if (this.preco>100){
            double desconto = this.preco*-0.10;
            desconto+=this.preco;
            System.out.println("o valor: " + desconto);
             
         }else{
             System.out.println("não tera desconto");
         }
        
    }
    
}

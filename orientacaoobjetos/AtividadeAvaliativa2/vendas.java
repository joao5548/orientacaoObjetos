
import java.util.Scanner;

public class vendas {
    
    public String nome;
    public double vendas;
    public double comissao = 0.10;
    public double numero=1000;

    void lapis(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite seus numeros de vendas: ");
        this.vendas = teclado.nextDouble();

        if (this.vendas>=this.numero) {
            double total = this.vendas*this.comissao;
            System.out.println("A comissão é de: " + total);
        }else{
            System.out.println("não tera comissão");
        }
    }


}

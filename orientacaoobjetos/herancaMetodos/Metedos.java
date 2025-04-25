
import java.util.Scanner;

public class Metedos {
    
    public String nome;
    public String telefone;
    public String cpf;
    public int numero;

    //metodo imprimir Atributos
    void imprimirAtributos(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite o telefone: ");
        this.telefone = teclado.nextLine();
        System.out.println("Digite o seu cpf: ");
        this.cpf = teclado.nextLine();
        System.out.println("Digite o seu numero: ");
        this.numero = teclado.nextInt();

        System.out.println(this.nome + " " + this.telefone + " " + this.cpf + " " + this.numero);


    }

}

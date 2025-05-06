
import java.util.Scanner;

public class animal {
    
    public String animal;
    public String tipo;
    public String domestico;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o animal: ");
        this.animal = teclado.nextLine();
        System.out.println("qual o tipo do animal: ");
        this.tipo = teclado.nextLine(); 
    }
    void exibir(){
        System.out.println(this.animal + " " + this.tipo);
    }
    void ehDomestico(){
        if (this.tipo == this.domestico) {
            System.out.println("verdadeiro");
        }else{
            System.out.println("false");
        }
    }
    

}

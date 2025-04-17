
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Sistema info = new Sistema();
        
        System.out.println("Digite seu nome: ");
        info.nome = teclado.nextLine(); 

        System.out.println("Digite seu cpf: ");
        info.cpf = teclado.nextLine();

        System.out.println(info.nome + " " + info.cpf);


    }

}


import java.util.Scanner;

public class livro {
    public int autor;
    public String titulo;
    
    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o titulo: ");
        this.titulo = teclado.nextLine();
        System.out.println("Digite o autor: ");
        this.autor = teclado.nextInt();
    }

}

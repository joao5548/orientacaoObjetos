
import java.util.Scanner;

public class livro {
    
    public int titulo;
    public String autor;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o titulo: ");
        this.titulo = teclado.nextInt();
        System.out.println("Digite o autor: ");
        this.autor - teclado.next();
    }

}

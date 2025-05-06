
import java.util.Scanner;

public class filme {
    
    public String titulo;
    public int classificacaoIndicativa;
    public int idadeUsuario;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        this.titulo = teclado.nextLine();
        System.out.println("qual a classificaçao de idade: ");
        this.classificacaoIndicativa = teclado.nextInt(); 
    }
    void podeAssistir(){
        if (this.idadeUsuario >=this.classificacaoIndicativa) {
            System.out.println("ele(a) pode assistir");
        }else{
            System.out.println("ele(a) não podera assitir");
        }
    }
}

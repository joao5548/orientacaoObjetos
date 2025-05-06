
import java.util.Scanner;

public class musica {
    
    public String nome;
    public int duracaoSegundos;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome da musica: ");
        this.nome = teclado.nextLine();
        System.out.println("DIgite a duração em segundos: ");
        this.duracaoSegundos = teclado.nextInt();
    }
    void classificarDuracao(){
        if (this.duracaoSegundos<120) {
            System.out.println("curta");
        }else if (this.duracaoSegundos>=120 && this.duracaoSegundos<=300) {
            System.out.println("Média");
        }else{
            System.out.println("longa");
        }
    }

}

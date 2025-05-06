
import java.util.Scanner;

public class jogo {
    public String jogador;
    public int pontuacao;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do jogador: ");
        this.jogador= teclado.nextLine();
        System.out.println("Digite sua pontuação: ");
        this.pontuacao = teclado.nextInt();
    }
    void verificarVitoria(){
        if(this.pontuacao>=1000){
            System.out.println("Vitória");
        }
        else{
            System.out.println("tente novamente");
        }
    }


}

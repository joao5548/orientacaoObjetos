
import java.util.Scanner;

public class turma {
    
    public String nomeTurma;
    public int mediaNotas;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da turma: ");
        this.nomeTurma = teclado.nextLine();
        System.out.println("Digite a media de nota da turma: ");
        this.mediaNotas = teclado.nextInt(); 
    }
    void avaliarDesempenho(){
        if (this.mediaNotas>=8) {
            System.out.println("Execelnte");
        }else if (this.mediaNotas== 6 && this.mediaNotas<=8) {
            System.out.println("bom");
        }else{
            System.out.println("precisa melhorar");
        }
    }

}


import java.util.Scanner;

public class aitividadeFisica {
    
    public String nomeAtividade;
    public int tempoMinutos;
    public int caloriasMinutos;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual o nome da atividade: ");
        this.nomeAtividade = teclado.nextLine();
        System.out.println("Digite o tempo da atividade: ");
        this.tempoMinutos = teclado.nextInt();
        System.out.println("quantas calorias por minutos: ");
        this.caloriasMinutos = teclado.nextInt();  
    }
    int caloriasTotais(){
        int total = (this.tempoMinutos * this.caloriasMinutos);
        System.out.println("total de calorias: " + total);
        return total;
    }

}

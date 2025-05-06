
import java.util.Scanner;

public class corrida {
    
    public String nome;
    public float distanciaEmKm;
    public float tempoEmHoras;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite a distancia em km: ");
        this.distanciaEmKm = teclado.nextFloat();
        System.out.println("Digite o tempo em minutos: ");
        this.tempoEmHoras = teclado.nextFloat();
    }
    float calcularVelocidadeMedia(){
        float vmedia = (this.distanciaEmKm / this.tempoEmHoras);

        System.out.println("A velocidade em km/h é: " + vmedia);

        return vmedia;
    }

}

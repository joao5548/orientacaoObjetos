import java.util.Scanner;

public class carro extends veiculo {
    
    void exibir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a placa do veiculo: ");
        this.placa = teclado.nextLine();
        System.out.println("Digite o chassi: ");
        this.chassi = teclado.nextLine();
    }
}


import java.util.Scanner;

public class funcionario {
    
    public String nome;
    public float salarioBase;

    void lerDados(){
        Scanner  teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digte seu saalario base");

    }

    double calcularSalarioFinal(){

        double resposta = this.salarioBase*1.10;
        System.out.println("O salario final é: " + resposta);
        return resposta;
    }

}

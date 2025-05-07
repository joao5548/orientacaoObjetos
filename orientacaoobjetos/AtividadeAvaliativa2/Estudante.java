
import java.util.Scanner;

public class Estudante {
    
    public String nome;
    public int matricula;
    public String curso;

    void joao(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite sua matricula: ");
        this.matricula = teclado.nextInt();
        System.out.println("DIgite seu curso: ");
        this.curso = teclado.nextLine();
        System.out.println("nome: " + this.nome );
        System.out.println(" matricula: " + this.matricula);
        System.out.println("curso: " + this.curso);      
    }
    


}


import java.util.Scanner;

public class concurso {
    
    public String nome;
    public int nota;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        this.nome = teclado.nextLine();
        System.out.println("Digite a nota: ");
        this.nota = teclado.nextInt();
    }
    void verificar(){
        if(this.nota>=70){
            System.out.println("ele passo");
        }else{
            System.out.println("ele não passou");
        }


}
}

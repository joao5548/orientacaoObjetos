
import java.util.Scanner;

public class heranca {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   
    
        ClasseMae mae = new ClasseMae();
        ClasseFilho filho = new ClasseFilho();
        ClasseFilha filha = new ClasseFilha();

        System.out.println("Digite o nome da Mãe: ");
        mae.nome = teclado.nextLine();

        mae.ano = teclado.nextInt();
        System.out.println("Qual a idade da Mãe: ");
        mae.idade = teclado.nextInt();

        System.out.println("Qual o ano da Mãe: ");
        mae.ano = teclado.nextInt();
                                  
        mae.cpf = teclado.nextLine();
        System.out.println("Qual o cpf da Mãe: ");
        mae.cpf = teclado.nextLine();

        System.out.println("Qual a quantidade de filhos: ");
        mae.qnt = teclado.nextInt();

        //informação do filho

        filho.nome = teclado.nextLine();
        System.out.println("Digite o nome do  filho: ");
        filho.nome = teclado.nextLine();

        System.out.println("Qual o cpf do filho: ");
        filho.cpf = teclado.nextLine();

        //informação da filha

        System.out.println("Digite o nome da filha: ");
        filha.nome = teclado.nextLine();

        System.out.println("Digite o cpf da filha: ");
        filha.cpf = teclado.nextLine();

        //imprimir atributos

        System.out.println("Mãe " + mae.nome + " " + mae.ano + " " + mae.ano + " " + mae.cpf + " " + mae.qnt);
        System.out.println("filho " + filho.nome + " " + filho.cpf);
        System.out.println("filha " + filha.nome + " " + filha.cpf);




    }

}

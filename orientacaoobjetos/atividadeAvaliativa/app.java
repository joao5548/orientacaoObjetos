
import java.util.Scanner;

public class app {
    
    public String nomeApp;
    public int versaoMinimaAndroid;
    public int versao = 7;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do app: ");
        this.nomeApp = teclado.nextLine();
        System.out.println("Digite a versão minima: ");
        this.versaoMinimaAndroid = teclado.nextInt();

    }
    void nomeFinal(){
        if(this.versaoMinimaAndroid >= this.versao){
            System.out.println("é compativel");
        }else{
            System.out.println("não é compativel");
        }
    }
    }



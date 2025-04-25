
import java.util.Scanner;

public class ClasseSistema {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ClasseCliente cliente = new ClasseCliente();
        ClasseFornecedor fornecedor = new ClasseFornecedor();
        ClasseProduto produto = new ClasseProduto();
        ClasseUsuario usuario = new ClasseUsuario();

        //Atributos do Objeto Cliente
        System.out.println("Cadastre o cliente");
        cliente.nome = teclado.nextLine();
        System.out.println("Cadastre o cpf");
        cliente.cpf = teclado.nextLine();
        System.out.println("Cadastre a razão social");
        cliente.razaoSocial = teclado.nextLine();

        //Atributos fornecedor
        System.out.println("Cadastro Fornecedor");
        fornecedor.nome = teclado.nextLine();
        System.out.println("Cadasto cpf");
        fornecedor.cpf = teclado.nextLine();
        System.out.println("Cadastro estoque");
        fornecedor.estoque = teclado.nextInt();

        //atributos produto
        produto.nome = teclado.nextLine();
        System.out.println("Cadastro produto");
        produto.nome = teclado.nextLine();
        System.out.println("Cadastro preço");
        produto.preco = teclado.nextFloat();

        //atributos usuario
        usuario.nome = teclado.nextLine();
        System.out.println("Cadastre o usuario");
        usuario.nome = teclado.nextLine();
        System.out.println("Cadadastro cpf");
        usuario.cpf = teclado.nextLine();
        System.out.println("Cadastro senha");
        usuario.senha = teclado.nextLine();
        
        //imprimir
        System.out.println("cliente " + cliente.nome + " " + cliente.cpf + " " + cliente.razaoSocial);
        System.out.println("fornecedor " + fornecedor.nome + " " + fornecedor.cpf + " " + fornecedor.estoque);
        System.out.println("Produto " + produto.nome + " " + produto.preco);
        System.out.println("usuario " + usuario.nome + " " +  usuario.cpf + " " + usuario.senha );
        



    }


}

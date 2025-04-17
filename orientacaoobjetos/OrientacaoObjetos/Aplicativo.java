public class Aplicativo {
    
    public static void main(String[] args) {
        
        Pessoa enzo = new Pessoa();
        Pessoa vinicius = new Pessoa();
        Carro carro = new Carro();

        System.out.println(enzo.nome + "" + enzo.genero + "" + enzo.idade);
        System.out.println(vinicius.nome + "" + vinicius.genero + "" + vinicius.idade);

        System.out.println(carro.ano + " " + carro.combustivel + " " + carro.marca + " " + carro.km + " " + carro.ano);


    }


}

package CadastroPet;

public class App {
    //aqui iniciamos a main, nos só usamos em um lugar
    public static  void main(String[] args) {
        //Aqui iniciamos a classe Responsavel e demos valores a seus atributos
        Responsavel pessoa1 = new Responsavel(
                "Rafael",
                "Carvalho Silva",
                "044-26320",
                "13",
                18,
                "rafaelcarvalhocs2016@gmail.com",
                "99499-4844");

        // mesma coisa
        Pet animal = new Pet(
                        "Jade",
                        "Cachorro",
                        "Vira-lata",
                        48,
                        "Preto",
                        pessoa1,
                Pet.TiposCuidado.BanhoETosa.toString());
            //imprimindo um item da lista, acessando a classe animal e usando o get por causa do Setter e Getter
            System.out.println(animal.getCor());








    }
}

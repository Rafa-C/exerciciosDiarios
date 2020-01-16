package CadastroPet;

public class App {
    public static  void main(String[] args) {
        Responsavel pessoa1 = new Responsavel(
                "Rafael",
                "Carvalho Silva",
                "044-26320",
                "13",
                18,
                "rafaelcarvalhocs2016@gmail.com",
                "99499-4844");


        Pet animal = new Pet(
                        "Jade",
                        "Cachorro",
                        "Vira-lata",
                        48,
                        "Preto",
                        pessoa1,
                Pet.TiposCuidado.BanhoETosa.toString());

            System.out.println(animal.getCor());








    }
}

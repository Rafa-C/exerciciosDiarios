package CadastroPet;
//o main so usa na app
//criamos uma classe, classe = Responsavel
public class Responsavel {
    //Deixamos privado e montamos o cadastro do dono
   private String nome;
    private String sobrenome;
    private String cep;
    private String numeroResidencial;
    // Aqui como é idade é calculavel
    private int idade;
    private String email;
    private String telefone;
    //Aqui criamos um metodo construtor, que ajuda na criaçao do objeto
    public Responsavel(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome;
        // o this (esta) servi para que o programa não confunda as variaveis
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }
    // Aqui criamos outro metodo, void pq não tem retorno de valor, algo parado
    public void retornarDadosBasicos() {

        if(nome== "Rafael"){

        System.out.println("Esse cara é do bem");
        }
        // "/n" serve para pular linha
        System.out.println("Nome: " + nome + "\n" + "E-mail: " + email);

    }

        //Criação de outro metdo,, esse serve para a parte do main, para imprimir tudo.
    public String retornarTodosDados() {
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
    //Aqui fizemos o getter e Setter
    //Getter serve para leitura, assim o sistema só lê
    //Setter, serve para modificar
    //Gette e Setter servem para o encapsulamento que ajuda na seguraça da informação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResidencial() {
        return numeroResidencial;
    }

    public void setNumeroResidencial(String numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

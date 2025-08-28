public class Motorista {
    private String nome;
    private String categoriaDaCarteira;
    private String cpf;
    private String rg;
    private String numeroDaCarteira;
    private Endereco endereco;
    private Caminhao caminhao;


    public Motorista (String nome, String categoriaDaCarteira, String cpf, String rg, String numeroDaCarteira, Endereco endereco, Caminhao caminhao) {
        this.nome = nome;
        this.categoriaDaCarteira = categoriaDaCarteira;
        this.cpf = cpf;
        this.rg = rg;
        this.numeroDaCarteira = numeroDaCarteira;
        this.endereco = endereco;
        this.caminhao = caminhao;
    }

    public String getNome (){
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCategoriaDaCarteira () {
        return categoriaDaCarteira;
    }

    public void setCategoriaDaCarteira (String categoriaDaCarteira) {
        this.categoriaDaCarteira = categoriaDaCarteira;
    }

    public String getCpf () {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getRg () {
        return rg;
    }

    public void setRg (String rg) {
        this.rg = rg;
    }

    public String getNumeroDaCarteira () {
        return numeroDaCarteira;
    }

    public void setNumeroDaCarteira (String numeroDaCarteira) {
        this.numeroDaCarteira = numeroDaCarteira;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    @Override
    public String toString() {
        return "Motorista {" +
                "\n  Nome: " + nome +
                "\n  Categoria da Carteira: " + categoriaDaCarteira +
                "\n  CPF: " + cpf +
                "\n  RG: " + rg +
                "\n  Número da Carteira: " + numeroDaCarteira +
                "\n  Endereço: " + endereco +
                "\n  Caminhão: " + caminhao +
                "\n}";
    }
}
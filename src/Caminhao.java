public class Caminhao {
    private String modeloCaminhao;
    private String carroceria;
    private String renavam;
    private double quilometragem;
    private int totalDeViagens;
    private Endereco endereco;
    private String placa;


    public Caminhao(String modeloCaminhao, String carroceria, String renavam, double quilometragem, double v, int totalDeViagens, Endereco endereco, String placa) {
        this.modeloCaminhao = modeloCaminhao;
        this.carroceria = carroceria;
        this.renavam = renavam;
        this.quilometragem = quilometragem;
        this.totalDeViagens = totalDeViagens;
        this.endereco = endereco;
        this.placa = placa;
    }

    public String getModeloCaminhao (){
        return modeloCaminhao;
    }

    public void setModeloCaminhao (String modeloCaminhao) {
        this.modeloCaminhao = modeloCaminhao;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getTotalDeViagens() {
        return totalDeViagens;
    }

    public void setTotalDeViagens(int totalDeViagens) {
        this.totalDeViagens = totalDeViagens;
    }

    public Endereco getEndereco() {
        return  endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public  String getPlaca () {
        return  placa;
    }

    public void setPlaca (String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Motorista: " + modeloCaminhao + "Categoria da carteira: " + carroceria +
                "CPF: " + renavam + "/ RG: " + quilometragem + "Número da Carteira: " + totalDeViagens +
                "Endereço: " + endereco + "}";
    }
}
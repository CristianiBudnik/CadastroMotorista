public class Endereco {
        private String cidade;
        private String estado;
        private String bairro;
        private String nomeDaRua;
        private int numeroDaCasa;
        private int cep;


        public Endereco (String cidade, String estado, String bairro, String nomeDaRua, int numeroDaCasa, int cep){
            this.cidade = cidade;
            this.estado = estado;
            this.bairro = bairro;
            this.nomeDaRua = nomeDaRua;
            this.numeroDaCasa = numeroDaCasa;
            this.cep = cep;
        }

        public String getCidade(){
            return cidade;
        }

        public void setCidade (String cidade) {
            this.cidade = cidade;
        }

        public String getEstado(){
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getBairro (){
            return bairro;
        }

        public void setBairro (String bairro) {
            this.bairro = bairro;
        }

        public String getNomeDaRua () {
            return nomeDaRua;
        }

        public void setNomeDaRua (String nomeDaRua) {
            this.nomeDaRua = nomeDaRua;
        }

        public int getNumeroDaCasa () {
            return numeroDaCasa;
        }

        public void setNumeroDaCasa (int numeroDaCasa) {
            this.numeroDaCasa = numeroDaCasa;
        }

        public int getCep () {
            return cep;
        }

        public void setCep (int cep) {
            this.cep = cep;
        }


        @Override
        public String toString() {
            return "Endereco {" +
                    "Cidade: " + cidade +
                    " / " + estado +
                    " - " + bairro +
                    " - Rua: " + nomeDaRua +
                    " n° " + numeroDaCasa +
                    " / CEP: " + cep + "}";
        }

}

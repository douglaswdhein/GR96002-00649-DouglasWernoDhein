public class Endereco {
    // Atributos da classe
    private String nomeDaRua;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    // Construtor que inicializa todos os atributos
    public Endereco(String nomeDaRua, String numero, String complemento, String cep, String cidade, String estado, String pais) {
        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    // Getter e Setter para o atributo nomeDaRua
    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    // Getter e Setter para o atributo numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Getter e Setter para o atributo complemento
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Getter e Setter para o atributo cep
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Getter e Setter para o atributo cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Getter e Setter para o atributo estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Getter e Setter para o atributo pais
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return "Rua: " + nomeDaRua +
                " - Número: " + numero +
                " - Complemento: " + complemento +
                " - CEP: " + cep +
                " - Cidade: " + cidade +
                " - Estado: " + estado +
                " - País: " + pais;
    }
}
public class Cosmetico extends Loja {
    // Extends é utilizado para criar classes que herdem atributos e métodos de outras classes
    // Neste caso está sendo utilizado o extends para herdar atributos/métodos da classe Loja

    // Atributo adicional da classe
    private double taxaComercializacao;

    // Construtor que inicializa todos os atributos
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Construtor vazio para criar objetos sem a obrigatoriedade de fornecer valores iniciais
    public Cosmetico(){
    }

    // Getter e Setter para o atributo taxaComercializacao
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return super.toString() +
                ", Taxa de Comercialização: " + taxaComercializacao;
    }
}
public class Bijuteria extends Loja {
    // Extends é utilizado para criar classes que herdem atributos e métodos de outras classes
    // Neste caso está sendo utilizado o extends para herdar atributos/métodos da classe Loja

    // Atributo adicional da classe
    private double metaVendas;

    // Construtor que inicializa todos os atributos
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }

    // Construtor vazio para criar objetos sem a obrigatoriedade de fornecer valores iniciais
    public Bijuteria(){
    }

    // Getter e Setter para o atributo metaVendas
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return super.toString() +
                ", Meta de Vendas: " + metaVendas;
    }
}

public class Vestuario extends Loja {
    // Extends é utilizado para criar classes que herdem atributos e métodos de outras classes
    // Neste caso está sendo utilizado o extends para herdar atributos/métodos da classe Loja

    // Atributo adicional da classe
    private boolean produtosImportados;

    // Construtor que inicializa todos os atributos
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
    }

    // Construtor vazio para criar objetos sem a obrigatoriedade de fornecer valores iniciais
    public Vestuario(){
    }

    // Getter e Setter para o atributo produtosImportados
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return super.toString() +
                ", Produto Importado: " + produtosImportados;
    }
}

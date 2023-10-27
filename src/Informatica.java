public class Informatica extends Loja {

    // Atributo adicional da classe
    private double seguroEletronicos;

    // Construtor que inicializa todos os atributos
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getter e Setter para o atributo seguroEletronicos
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return super.toString() + ", Seguro dos Eletrônicos: " + seguroEletronicos;
    }
}

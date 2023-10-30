public class Alimentacao extends Loja {
    // Extends é utilizado para criar classes que herdem atributos e métodos de outras classes
    // Neste caso está sendo utilizado o extends para herdar atributos/métodos da classe Loja

    // Atributo adicional da classe
    private Data dataAlvara;

    // Construtor que inicializa todos os atributos
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }

    // Construtor vazio para criar objetos sem a obrigatoriedade de fornecer valores iniciais
    public Alimentacao(){
    }

    // Getter e Setter para o atributo dataAlvara
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return super.toString() +
                ", Data do Alvará: " + dataAlvara;
    }
}

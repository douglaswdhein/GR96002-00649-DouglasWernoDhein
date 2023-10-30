import java.util.Arrays;

public class Loja {

    // Atributos da classe
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    private int estoque;

    // Construtor que inicializa todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoqueProdutos];
        this.estoque = 0;
    }

    // Construtor que inicializa nome e quantidade de funcionários, com salário base = -1
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoqueProdutos];
        this.estoque = 0;
    }

    // Construtor vazio para criar objetos sem a obrigatoriedade de fornecer valores iniciais
    public Loja() {
    }

    // Getter e Setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o atributo quantidadeFuncionarios
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    // Getter e Setter para o atributo salarioBaseFuncionario
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    // Getter e Setter para o atributo endereco
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Getter e Setter para o atributo dataFundacao
    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    // Getter e Setter para o atributo estoqueProdutos
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Método para inserir algum produto
    // O método deve retornar verdadeiro caso o produto seja inserido no estoque ou falso caso não seja
    public boolean insereProduto(Produto produto) {
        if (this.estoque < this.estoqueProdutos.length) {
            this.estoqueProdutos[this.estoque] = produto;
            this.estoque++;
            return true;
        }
        return false;
    }

    // Método para remover algum produto
    // O método retorna verdadeiro caso o produto tenha sido removido e falso caso contrário
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < this.estoque; i++) {
            if (this.estoqueProdutos[i] != null && this.estoqueProdutos[i].getNome().equals(nomeProduto)) {
                for (int j = i; j < this.estoque - 1; j++) {
                    this.estoqueProdutos[j] = this.estoqueProdutos[j + 1];
                }
                this.estoqueProdutos[this.estoque - 1] = null;
                this.estoque--;
                return true;
            }
        }
        return false;
    }

    // Método para imprimir os produtos
    public String imprimeProdutos() {
        String retorno = "";
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] != null)
                retorno += this.estoqueProdutos[i].getNome() + ",";
        }

        return retorno;
    }

    // Método gastosComSalario que retorna quanto a loja gasta com o salário de todos os seus funcionários
    // Caso o salarioBaseFuncionario for igual a -1, o cálculo não é realizado e retorna apenas -1
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    // Método tamanhoDaLoja
    // Caso a loja possua MENOS que 10 funcionários, retornar o caractere 'P'
    // Caso a loja possua ENTRE 10 (inclusive) e 30 (inclusive), retornar o caractere 'M'
    // Caso a loja possua MAIS que 31 (inclusive) funcionários, retornar o caractere 'G'
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return "Nome da Loja: " + nome +
                ", Quantidade de funcionários: " + quantidadeFuncionarios +
                ", Salário Base dos funcionários: " + salarioBaseFuncionario +
                ", Endereço: " + endereco +
                ", Data de fundação: " + dataFundacao +
                ", Produtos: " + Arrays.toString(estoqueProdutos);
    }

}

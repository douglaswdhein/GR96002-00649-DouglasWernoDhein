public class Loja {

    // Atributos da classe
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    // Construtor que inicializa todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    // Construtor que inicializa nome e quantidade de funcionários, com salário base = -1
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
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
                ", Salário Base dos funcionários: " + salarioBaseFuncionario;
    }

}

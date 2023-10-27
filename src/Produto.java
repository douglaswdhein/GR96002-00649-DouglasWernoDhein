public class Produto {

    // Atributos da classe
    private String nome;
    private double preco;
    private Data dataValidade;

    // Construtor que inicializa todos os atributos
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Getter e Setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o atributo preco
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter e Setter para o atributo dataValidade
    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método que verifica se o produto está vencido em relação a uma data
    public boolean estaVencido(Data data) {
        if (data.getAno() > dataValidade.getAno()) {
            return true;
        } else if (dataValidade.getAno() == data.getAno() && data.getMes() > dataValidade.getMes()) {
            return true;
        } else if (dataValidade.getAno() == data.getAno() && dataValidade.getMes() == data.getMes() &&
                data.getDia() > dataValidade.getDia()) {
            return true;
        } else {
            return false;
        }
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Preço: R$" + preco +
                ", Data de Validade: " + dataValidade;
    }
}

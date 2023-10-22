public class Produto {
    // Atributos da classe
    private String nome;
    private double preco;

    // Construtor que inicializa todos os atributos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Preço: R$" + preco;
    }
}

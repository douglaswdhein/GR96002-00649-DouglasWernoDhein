import java.util.Arrays;

public class Shopping {

    // Atributos da classe
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int numeroLojas;

    // Construtor que inicializa todos os atributos
    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
        this.numeroLojas = 0;
    }

    // Getter e Setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o atributo endereco
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Getter e Setter para o atributo lojas
    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Método para inserir uma loja
    //O método retorna verdadeiro caso a loja seja inserida corretamente e falso caso contrário
    public boolean insereLoja(Loja loja) {
        if (this.numeroLojas < this.lojas.length) {
            this.lojas[this.numeroLojas] = loja;
            this.numeroLojas++;
            return true;
        }

        return false;
    }

    // Método para remover uma loja
    //O método retorna verdadeiro caso a loja seja removida e falso caso contrário
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < this.numeroLojas; i++) {
            if (this.lojas[i] != null && this.lojas[i].getNome().equals(nomeLoja)) {
                for (int j = i; j < this.numeroLojas - 1; j++) {
                    this.lojas[j] = this.lojas[j + 1];
                }
                this.lojas[this.numeroLojas - 1] = null;
                this.numeroLojas--;
                return true;
            }
        }
        return false;
    }

    // Método que recebe como parâmetro uma String que indica o tipo de loja que deve ser buscado
    // Deve retornar a quantidade de lojas desse tipo que existem no shopping
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int numeroLojas = 0;
        int alimentacao = 0;
        int bijuteria = 0;
        int cosmetico = 0;
        int informatica = 0;
        int vestuario = 0;

        switch (tipoLoja.toLowerCase()) {
            case "alimentação":
                for (Loja loja : lojas) {
                    if (loja instanceof Alimentacao) {
                        alimentacao++;
                        numeroLojas = alimentacao;
                    }
                }
                break;
            case "bijuteria":
                for (Loja loja : lojas) {
                    if (loja instanceof Bijuteria) {
                        bijuteria++;
                        numeroLojas = bijuteria;
                    }
                }
                break;
            case "cosmético":
                for (Loja loja : lojas) {
                    if (loja instanceof Cosmetico) {
                        cosmetico++;
                        numeroLojas = cosmetico;
                    }
                }
                break;
            case "informática":
                for (Loja loja : lojas) {
                    if (loja instanceof Informatica) {
                        informatica++;
                        numeroLojas = informatica;
                    }
                }
                break;
            case "vestuário":
                for (Loja loja : lojas) {
                    if (loja instanceof Vestuario) {
                        vestuario++;
                        numeroLojas = vestuario;
                    }
                }
                break;
            default:
                System.out.println("Não há lojas desse tipo!");
        }

        return numeroLojas;
    }

    // Método retorna que recebe a loja do tipo Informatica que paga o maior valor de seguro de eletrônicos do shopping
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0.0;
        for (int i = 0; i < numeroLojas; i++) {
            if (lojas[i] instanceof Informatica lojaInformatica) {
                double valorSeguro = lojaInformatica.getSeguroEletronicos();
                if (valorSeguro > maiorValorSeguro) {
                    maiorValorSeguro = valorSeguro;
                    lojaMaisCara = lojaInformatica;
                }
            }
        }
        return lojaMaisCara;
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return "- Shopping -" +
                ", Nome: " + nome +
                ", Endereço: " + endereco +
                ", Lojas: " + Arrays.toString(lojas);

    }

}
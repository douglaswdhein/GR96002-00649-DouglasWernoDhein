public class Data {

    // Atributos da classe
    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa os atributos com validação de data
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Getter e Setter para o atributo dia
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    // Getter e Setter para o atributo mes
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    // Getter e Setter para o atributo ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para verificar se um ano é bissexto
    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return true;
        }
        return false;
    }

    // Método para validar a data
    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }
        return true;
    }

    // Método para obter o número de dias em um mês, considerando se o ano é bissexto
    private int diasNoMes(int mes, int ano) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (verificaAnoBissexto() && mes == 2) {
            return 29;
        }
        return diasPorMes[mes];
    }

    // Método toString que retorna uma representação formatada dos atributos
    // @Override é usado para garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public String toString() {
        return dia +
                " de " + mes +
                " de " + ano;
    }
}
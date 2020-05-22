package Model;

public class Pessoa {
    // Atributos
    private int anoNascimento;
    private int anoAtual;
    // Manipuladores de atributos
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public int getAnoAtual() {
        return anoAtual;
    }
    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    // Métodos
    public int calcularIdadeAtual(){
        return this.anoAtual - this.anoNascimento;
    }
    public int calcularIdadeFutura(){
        return 2030 - this.anoNascimento;
    }

    // toString

    @Override
    public String toString() {
        return "Ano de Nascimento: " + anoNascimento + "\nAno Atual: " + anoAtual;
    }
}

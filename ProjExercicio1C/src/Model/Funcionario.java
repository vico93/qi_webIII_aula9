package Model;

public class Funcionario {
    // Atributos
    private String nome;
    private String cpf;
    private int horasTrabalhadas;
    // Manipuladores de atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Métodos
    public double calcularSalarioBruto(){
        return 50 * this.horasTrabalhadas;
    }
    public double calcularSalarioComAumento(){
        return this.calcularSalarioBruto() * 1.10; // 110%;
    }

    // toString
    @Override
    public String toString() {
        return "Funcionário: " + nome + "\nCPF: " + cpf + "\nHoras trabalhadas: " + horasTrabalhadas + "hs";
    }
}

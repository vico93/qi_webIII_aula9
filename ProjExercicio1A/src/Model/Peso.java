package Model;

public class Peso {
    // Atributos
    private double peso;
    // Manipuladores dos atributos
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos
    public double calcularNovoPeso(double percentualReajuste){
        return this.peso * percentualReajuste; // Peso multiplicado pelo percentual de reajuste
    }

    // toString
    @Override
    public String toString() {
        return "Peso informado: " + String.format("%.2f", peso) + "Kg";
    }
}

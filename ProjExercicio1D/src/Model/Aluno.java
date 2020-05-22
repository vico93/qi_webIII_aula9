package Model;

import java.util.Arrays;

public class Aluno {
    // Atributos
    private String nome;
    private double[] notas;
    private int frequencia;
    // Manipuladores de atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public int getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    // Métodos - TESTANDO ARRAY E FOR PROFE, DESCULPE POR ME ADIANTAR
    public double calcularMedia(){
        double soma = 0.0;
        for(int i=0; i<this.notas.length; i++){
            soma = soma + this.notas[i];
        }
        return soma / this.notas.length;
    }

    // toString
    @Override
    public String toString() {
        // Monta a string de retorno em uma variável local por causa do loop
        String textoRetorno = "Nome do Aluno: " + nome + "\n Notas: ";
        for(int i=0; i<this.notas.length; i++){
            textoRetorno = textoRetorno + String.format("%.2f", this.notas[i]) + " | ";
        }
        textoRetorno = textoRetorno + "\nFrequência: " + frequencia;

        return textoRetorno;
    }
}

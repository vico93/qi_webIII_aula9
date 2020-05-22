package View;

import Model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Aluno a1 = new Aluno();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o nome do aluno: ");
        a1.setNome(entrada.nextLine());

        double[] notas = {0.0, 0.0, 0.0}; // Variável que armazena as notas (tive que colocar valores padrões pra não dar nullPointerException
        System.out.print("Digite a nota 1: ");
        notas[0] = entrada.nextDouble();

        System.out.print("Digite a nota 2: ");
        notas[1] = entrada.nextDouble();

        System.out.print("Digite a nota 3: ");
        notas[2] = entrada.nextDouble();

        a1.setNotas(notas); // Envia o array de notas para o método setter

        System.out.print("Digite a frequência: ");
        a1.setFrequencia(entrada.nextInt());

        // Invoca os métodos e mostra resultados
        System.out.println(a1);
        System.out.println("Média de " + a1.getNome() + ": " + String.format("%.2f", a1.calcularMedia()));
    }
}

package View;

import Model.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Funcionario f1 = new Funcionario();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o nome do colaborador: ");
        f1.setNome(entrada.nextLine());

        System.out.print("Digite o CPF do colaborador (sem traços/pontos): ");
        f1.setCpf(entrada.nextLine());

        System.out.print("Digite o número de horas trabalhadas por " + f1.getNome() + ": ");
        f1.setHorasTrabalhadas(entrada.nextInt());

        // Invoca os métodos e mostra resultados
        System.out.println(f1);
        System.out.println("Salário Bruto: " + String.format("R$ %.2f", f1.calcularSalarioBruto()) + "\nSalário com 10% de aumento: " + String.format("R$ %.2f", f1.calcularSalarioComAumento()));
    }
}

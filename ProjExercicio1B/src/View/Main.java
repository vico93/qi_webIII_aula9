package View;

import Model.Pessoa;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Pessoa p1 = new Pessoa();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o seu ano de nascimento: ");
        p1.setAnoNascimento(entrada.nextInt());

        p1.setAnoAtual(Calendar.getInstance().get(Calendar.YEAR)); // Trakinagem minha pra pegar o ano atual, rs

        // Invoca os métodos e mostra resultados
        System.out.println(p1);
        System.out.println("Sua idade hoje: " + p1.calcularIdadeAtual());
        System.out.println("Sua idade em 2030: " + p1.calcularIdadeFutura());
    }
}

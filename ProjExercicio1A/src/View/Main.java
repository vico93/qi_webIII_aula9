package View;

import Model.Peso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Peso p1 = new Peso();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o seu peso atual, em Kg: ");
        p1.setPeso(entrada.nextDouble());

        // Invoca os métodos e mostra resultados
        System.out.println(p1);
        System.out.println("Seu novo peso caso engorde 15%: " + String.format("%.2f", p1.calcularNovoPeso(1.15)) + "Kg"); // engordar 15% = 115%
        System.out.println("Seu novo peso caso emagreça 20%: " + String.format("%.2f", p1.calcularNovoPeso(0.8)) + "Kg"); // emagrecer 20% = 80%
    }
}

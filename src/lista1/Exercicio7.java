package lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, mes;
        double numCarro, totalVendas, salario;

        System.out.println("Insira o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Insira o mês regente: ");
        mes = scanner.nextLine();

        System.out.println("Insira o números de carros vendidos: ");
        numCarro = Double.parseDouble(scanner.nextLine());

        System.out.println("Insira o valor total de vendar em R$ ");
        totalVendas = Double.parseDouble(scanner.nextLine());

        salario = 1500 + (350 * numCarro) + (totalVendas * 0.00001);

        System.out.printf("\n\nHolerite referente ao mês %s", mes);
        System.out.printf("\nSEJA BEM VINDO(A) %s", nome);
        System.out.printf("\nCOM BASE NA QUANTIDADE DE CARROS VENDIDOS POR VOCÊ, QUE FORAM %.0f CARROS", numCarro);
        System.out.printf("\nCOM BASE NO VALOR TOTAL DAS VENDAS DA EMPRESA, QUE FORAM R$%.2f", totalVendas);
        System.out.printf("\nSEU SALARIO ESSE MES É DE %.2f REAIS", salario);
    }
}

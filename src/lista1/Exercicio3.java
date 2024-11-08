package lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double compra, venda, representante, imposto;

        System.out.print("Por favor, informe o valor da compra: R$  ");
        compra = Double.parseDouble(scanner.nextLine());

        representante = compra * 0.2;
        imposto = compra * 0.3;
        venda = compra + representante + imposto;

        System.out.printf("\n\nO Valor referente ao representante foi de %.2f\n\n", representante);
        System.out.printf("O Valor referente ao imposto foi de %.2f\n\n", imposto);
        System.out.printf("O Valor referente a venda foi de %.2f\n\n", venda);

    }
}

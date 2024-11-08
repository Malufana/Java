package lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aux = 0, opcao;
        double n1, n2;

        System.out.println("Insira um número");
        n1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Insira outro número");
        n2 = Double.parseDouble(scanner.nextLine());

        while(aux == 0){
            System.out.println("Qual operação gostaria de realizar?\n");
            System.out.println("""
                    [1] Soma
                    [2] Subtração
                    [3] Multiplicação
                    [4] Divisão
                    [5] Potência
                    [6] Resto da divisão
                    [7] Sair
                    """);

            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> {
                    double soma;
                    soma = n1 + n2;
                    System.out.printf("A soma dos dois números é: %.2f\n\n", soma);
                }
                case 2 -> {
                    double sub;
                    sub = n1 - n2;
                    System.out.println("A subtração do primeiro número pelo segundo");
                    System.out.printf("É de %.2f\n\n", sub);
                }
                case 3 -> {
                    double mult;
                    mult = n1 * n2;
                    System.out.printf("A multiplicação dos números é de %.2f\n\n", mult);
                }
                case 4 -> {
                    double div;
                    if(n2 != 0){
                        div = n1 / n2;
                        System.out.printf("A divisão dos números é de %.2f\n\n", div);
                    }else {
                        System.out.println("A divisão não poderá ser realizada\n\n");
                    }
                }
                case 5 -> {
                    double pot;
                    pot = Math.pow(n1, n2);
                    System.out.printf("A potenciação do primerio número pelo segundo é de %.2f \n\n", pot);
                }
                case 6 -> {
                    double resto;
                    resto = n1 % n2;
                    System.out.printf("O resto da divisão entre os dois números é de %.2f\n\n", resto);
                }
                case 7 -> {
                    aux = 1;
                }
            }
        }
        System.out.println("SAINDO\n\n\n");
    }
}

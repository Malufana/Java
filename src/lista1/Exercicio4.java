package lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Insira um número: ");
        num = scanner.nextInt();

        int suc, ant;

        suc = num + 1;
        ant = num - 1;

        System.out.printf("O número informado foi %d, o antecessor  é %d e o sucessor é %d", num, ant, suc);
    }
}

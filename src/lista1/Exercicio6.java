package lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nt1, nt2, ntFinal;

        System.out.print("Insira a primeira nota: ");
        nt1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Insira a segunda nota: ");
        nt2 = Double.parseDouble(scanner.nextLine());

        ntFinal = (nt1 * 0.4) + (nt2 * 0.6);

        System.out.printf("A nota final foi de %.2f", ntFinal);
    }
}

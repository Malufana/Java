package lista1;

import java.util.Scanner;

public class Excercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora, min, seg;
        int segundos;

        System.out.print("Insira a hora: ");
        hora = scanner.nextInt();

        System.out.print("Insira os minutos: ");
        min = scanner.nextInt();

        System.out.print("Insira os segundos: ");
        seg = scanner.nextInt();

        segundos = (hora * 60 * 60) + (min * 60) + seg;

        System.out.printf("O Horario em segundos é de %d", segundos);
    }
}

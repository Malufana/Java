package lista2;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media, qtdMax, qtdMin, qtdAtual;

        System.out.println("Digite a quantidade atual do estoque: ");
        qtdAtual = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a quantidade máxima do estoque: ");
        qtdMax = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a quantidade mínima do estoque: ");
        qtdMin = Double.parseDouble(scanner.nextLine());

        media = ((qtdMax + qtdMin) / 2);

        if(qtdAtual >= media){
            System.out.println("Não efutuar compra");
        }else {
            System.out.println("Efetuar compra");
        }
    }
}

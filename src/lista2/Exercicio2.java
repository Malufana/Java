package lista2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtd;
        double preco, valor;

        System.out.println("Digite o valor unitario do produto que esta comprando: ");
        preco = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a quantidade de produtos que esta comprando: ");
        qtd = scanner.nextInt();

        if(qtd <= 12){
            valor = qtd * preco;
            System.out.printf("O valor total de sua compra é de %.2f", valor);
        }else{
            valor = (qtd * preco) - (preco / 10);
            System.out.printf("O valor total de sua compra é de %.2f", valor);
        }
    }
}

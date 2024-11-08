package lista2;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade <= 14){
            System.out.println("Você está na categoria CRIANÇA");
        }else if(idade <= 17){
            System.out.println("Você está na categoria ADOLESCENTE");
        }else if(idade <= 30){
            System.out.println("Você está na categoria ADULTO JOVEM");
        }else{
            System.out.println("Você está na categoria ADULTO");
        }
    }
}

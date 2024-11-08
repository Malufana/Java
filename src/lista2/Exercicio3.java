package lista2;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeA, timeB;

        System.out.println("Digite a quantidade de gols do time A: ");
        timeA = scanner.nextInt();
        System.out.println("Digite a quantidade de gols do time B: ");
        timeB = scanner.nextInt();

        if(timeA == timeB){
            System.out.println("O jogo EMPATOU");
        } else if(timeA > timeB){
            System.out.println("O time A GANHOU");
        }else {
            System.out.println("O time B GANHOU");
        }
    }
}

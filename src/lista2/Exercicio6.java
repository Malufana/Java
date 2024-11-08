package lista2;
import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1, max = 100, sug, i =0;
        Random random = new Random();
        int aleatorio = random.nextInt(max - min +1) + min;
        boolean jogo = true;

        while(jogo && i < 3){
            System.out.println("Qual número foi sorteado: ");
            sug = scanner.nextInt();

            if(sug == aleatorio){
                System.out.println("Você acertou!");
                jogo = false;
            }else {
                System.out.println("Você errou");
                i++;
            }
        }
        System.out.printf("\n\nO numero sorteado foi %d", aleatorio);
    }
}

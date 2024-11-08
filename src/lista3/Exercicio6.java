package lista3;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, aux = 0;

        System.out.println("Digite um número de 1 a 10: ");
        num = scanner.nextInt();

        if(num <= 10){
            System.out.println("TABUADA DO" + num);

            for(int i = 0; i < 11; i++){
                int mult = num * aux;
                System.out.println(num + " * " + aux +  " = " + mult);
                aux++;
            }
        }
    }
}

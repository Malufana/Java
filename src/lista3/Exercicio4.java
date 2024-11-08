package lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0, incremento = 0, soma = 0;

        System.out.println("Informe um número: ");
        numero = scanner.nextInt();

        System.out.println("Informe um incremento: ");
        incremento = scanner.nextInt();

        for(int i = 0; i < numero; i++){
            System.out.println(soma);
            if(soma == numero){
                break;
            }
            soma = soma + incremento;
        }
    }
}

package lista3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeros;
        int opcao;

        System.out.println("Insira 10 numeros: ");
        numeros = scanner.nextLine();

        String[] vetorNumeros = numeros.split(" ");

        while(true){
            System.out.println("O QUE DESEJA SABER?");
            System.out.println("""
                [1] QUANTOS NÚMEROS PARES?
                [2] QUANTOS NÚMEROS ÍMPARES?
                [3] QUANTOS NÚMEROS POSITIVOS?
                [4] QUANTOS NÚMEROS NEGATIVOS?
                [5] SAIR
                """);
            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> {
                    int cont = 0;
                    int[] vetorInt = new int[vetorNumeros.length];
                    for(int i = 0; i < vetorNumeros.length; i++){
                        vetorInt[i] = Integer.parseInt(vetorNumeros[i]);
                        if(vetorInt[i] % 2 == 0){
                            cont++;
                        }
                    }
                    System.out.printf("Números pares: %d", cont);
                }
                case 2 -> {
                    int cont = 0;
                    int[] vetorInt = new int[vetorNumeros.length];
                    for(int i = 0; i < vetorNumeros.length; i++){
                        vetorInt[i] = Integer.parseInt(vetorNumeros[i]);
                        if(vetorInt[i] % 2 == 1) {
                            cont++;
                        }
                    }
                    System.out.printf("Números ímpares: %d", cont);
                }
                case 3 -> {
                    int cont = 0;
                    double[] vetorInt = new double[vetorNumeros.length];
                    for(int i = 0; i < vetorNumeros.length; i++){
                        vetorInt[i] = Double.parseDouble(vetorNumeros[i]);
                        if(vetorInt[i] > 0){
                            cont++;
                        }
                    }
                    System.out.printf("Números positivos: %d",cont);
                }
                case 4 -> {
                    int cont = 0;
                    double[] vetorInt = new double[vetorNumeros.length];
                    for(int i = 0; i < vetorNumeros.length; i++){
                        vetorInt[i] = Double.parseDouble(vetorNumeros[i]);
                        if(vetorInt[i] < 0){
                            cont++;
                        }
                    }
                    System.out.printf("Números negativos: %d",cont);
                }
                case 5 -> {
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;
                }
            }
        }
    }
}

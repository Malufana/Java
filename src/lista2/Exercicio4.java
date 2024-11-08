package lista2;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao, comida;

        System.out.println("QUAL O DESTINO DA SUA VIAGEM?\n");
        System.out.println("""
                [1] MACEÍO
                [2] PORTO DE GALINHAS
                """);
        opcao = scanner.nextInt();

        System.out.println("COM ALMOÇO/JANTA INCLUSO?");
        System.out.println("""
                [1] SIM
                [2] NÃO
                """);
        comida = scanner.nextInt();

        switch (opcao){
            case 1 -> {
                if(comida == 1){
                    System.out.println("O VALOR TOTAL DA VIAGEM É DE R$6.000,00");
                }else{
                    System.out.println("O VALOR TOTAL DA VIAGEM É DE R$5.550,00");
                }
            }
            case 2 -> {
                if(comida == 1){
                    System.out.println("O VALOR TOTAL DA VIAGEM É DE R$4.800,00");
                }else{
                    System.out.println("O VALOR TOTAL DA VIAGEM É DE R$4.350,00");
                }
            }
        }


    }
}

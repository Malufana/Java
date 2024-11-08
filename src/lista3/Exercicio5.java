package lista3;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] saldo = new double[6]; //valor de teste
        int opcao, i = 0, negativo = 0, positivo = 0;

        for(i = 0; i < saldo.length; i++){
            System.out.println("Adicione o saldo: ");
            saldo[i] = scanner.nextDouble();

            System.out.println("DESEJA CONTINUAR ADICIONANDO SALDOS?");
            System.out.println("[1] - SIM || [2] - NÃO");
            opcao = scanner.nextInt();
            if(opcao == 1){
                continue;
            }else{
                break;
            }
        }

        for(i = 0; i < saldo.length; i++){
            if(saldo[i] < 0){
                negativo++;
            }else{
                positivo++;
            }
            System.out.printf("Tiveram %d contas com saldo negativo", negativo);
            System.out.printf("Tiveram %d contas com saldo positivo", positivo);
        }
        if(negativo > positivo){
            System.out.println("RISCO AO BANCO!");
        }else{
            System.out.println("NENHUM RISCO AO BANCO!");
        }
//        System.out.printf(Arrays.toString(saldo));
    }
}

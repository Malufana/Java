package lista3;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 6;
        String[] nome = new String[N];
        Double[] altura = new Double[N];
        Double[] peso = new Double[N];
        double maiorAltura = 0, maiorPeso = 0;
        int i = 0;
        String maiornomePeso = "", maiornomeAltura = "";

        for(i = 0; i < N; i++){
            System.out.println("INSIRA O NOME: ");
            nome[i] = scanner.nextLine();

            System.out.println("INSIRA O PESO: ");
            peso[i] = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("INSIRA A ALTURA: ");
            altura[i] = scanner.nextDouble();
            scanner.nextLine();

            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
                maiornomeAltura = nome[i];
            }

            if(peso[i] > maiorPeso) {
                maiorPeso = peso[i];
                maiornomePeso = nome[i];
            }
        }
        System.out.printf("\nA pessoa mais pesada é %s", maiornomePeso);
        System.out.printf("\nE tem um peso de %.2f kg", maiorPeso);
        System.out.println();
        System.out.printf("\nA pessoa mais alta é %s", maiornomeAltura);
        System.out.printf("\nCom uma altura de %.2f cm", maiorAltura);
    }
}

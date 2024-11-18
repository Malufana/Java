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
        String maiornome = "";

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
                maiorPeso = peso[i];
                maiornome = nome[i];
            }

            if(peso[i] > maiorPeso) {
                maiorAltura = altura[i];
                maiorPeso = peso[i];
                maiornome = nome[i];
            }
        }
        System.out.printf("\nA pessoa mais pesada é %s", maiornome);
        System.out.printf("\nE um peso de %f", maiorPeso);
        System.out.printf("\nCom uma altura de %f cm", maiorAltura);

        System.out.printf("\nA pessoa mais alta é %s", maiornome);
        System.out.printf("\nCom uma altura de %f cm", maiorAltura);
        System.out.printf("\nE um peso de %f", maiorPeso);
    }
}

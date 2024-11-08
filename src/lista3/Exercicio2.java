package lista3;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String idade, altura, peso;
        int contIdade = 0, contAltura = 0, contPeso = 0;

        System.out.println("INSIRA A IDADE DE 10 PESSOAS: ");
        idade = scanner.nextLine();

        System.out.println("INSIRA O PESO DE 10 PESSOAS: ");
        peso = scanner.nextLine();

        System.out.println("INSIRA A ALTURA DE 10 PESSOAS: ");
        altura = scanner.nextLine();

        String[] vetorIdade = idade.split(" ");
        int[] idadeVetor = new int[vetorIdade.length];

        String[] vetorPeso = peso.split(" ");
        int[] pesoVetor = new int[vetorPeso.length];

        String[] vetorAltura = altura.split(" ");
        int[] alturaVetor = new int[vetorAltura.length];

        for(int i = 0; i < vetorIdade.length; i++){
            idadeVetor[i] = Integer.parseInt(vetorIdade[i]);
            if(idadeVetor[i] > 50){
                contIdade++;
            }
        }
        System.out.printf("\nA quantidade de pessoas que tem idade acima de 50 anos é de: %d", contIdade);
        for(int i = 0; i < vetorPeso.length; i++){
            pesoVetor[i] = Integer.parseInt(vetorPeso[i]);
            if(pesoVetor[i] < 80){
                contPeso++;
            }
        }
        System.out.printf("\nA quantidade de pessoas que tem peso abaixo de 80kg é de: %d", contPeso);
        for(int i = 0; i < vetorAltura.length; i++){
            alturaVetor[i] = Integer.parseInt(vetorAltura[i]);
            if(alturaVetor[i] > 160){
                contAltura++;
            }
        }
        System.out.printf("\nA quantidade de pessoas que tem altura acima de 160 é de: %d", contAltura);
    }
}

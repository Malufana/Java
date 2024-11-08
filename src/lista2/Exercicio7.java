package lista2;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        String per;

        System.out.println("JOGO DE BRINDES");
        System.out.println("""
                GOSTARIA DE RESPONDER QUAL PERGUNTA?
                [1] OU [2]
                """);
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch(opcao){
            case 1 -> {
                System.out.println("PERGUNTA 1");
                System.out.println("Qual é o nome do desenho animado que apresenta um grupo de super-heróis adolescentes que combatem o crime?");
                System.out.println("""
                        [A] Os Jovens Titãs
                        [B] Liga da Justiça
                        [C] Os Incríveis
                        [D] Os Vingadores
                        """);
                per = scanner.nextLine().toLowerCase();
                if(per.equals("a")){
                    System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
                }else{
                    System.out.println("Você errou, mas tente novamente numa próxima");
                }
            }
            case 2 -> {
                System.out.println("PERGUNTA 2");
                System.out.println("Qual é o nome do pai de Jorel?");
                System.out.println("""
                        [A] José
                        [B] Jorge
                        [C] Edson
                        [D] Nico
                        """);
                per = scanner.nextLine().toLowerCase();
                if(per.equals("c")){
                    System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
                }else{
                    System.out.println("Você errou, mas tente novamente numa próxima");
                }
            }
        }
    }
}

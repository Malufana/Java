import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variaveis da Probelmatica
        double quantiaCarlos = 0;
        String aprovacaoDeAninha = "";
        boolean feriasDaJoana = false;

        //Variaveis para o controle do programa
        int opcao = 0;
        String continuar = "";

        //Variaveis para a entrada
        Scanner scanner = new Scanner(System.in);

        while(!continuar.equalsIgnoreCase("sair")){
            System.out.println("Qual membro da familia você deseja inserir dados?");
            System.out.println("""
                    [1] Carlos
                    [2] Joana
                    [3] Aninha
                    [4] Exibir Situação
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    try {
                        System.out.print("Qual a quantia que Carlos conseguiu juntar?");
                        quantiaCarlos = Double.parseDouble(scanner.nextLine());
                        continue;
                    } catch (NumberFormatException e) {
                        System.out.println("Você digitou caracteres invalidos!!\n\n");
                        continue;
                    }
                }
                case 2 -> {
                    System.out.println("Joana conseguiu tirar ferias? Digite sim ou não");
                    feriasDaJoana = scanner.nextLine().equalsIgnoreCase("sim");
                    continue;
                }
                case 3 -> {
                    System.out.println("Aninha foi aprovada na escola? Digite Aprovada ou Reprovada");
                    aprovacaoDeAninha = scanner.nextLine();
                    continue;
                }
                case 4 -> {
                    if(quantiaCarlos >= 8000 && aprovacaoDeAninha.equalsIgnoreCase("aprovada") && feriasDaJoana){
                        System.out.println("A familia podera viajar");
                    } else if (quantiaCarlos < 8000 && aprovacaoDeAninha.equalsIgnoreCase("aprovada") && feriasDaJoana) {
                        System.out.println("Carlos não conseguiu juntar a quantia");
                    } else if(quantiaCarlos >= 8000 && aprovacaoDeAninha.equalsIgnoreCase("aprovada") && !feriasDaJoana){
                        System.out.println("Joana não conseguiu tirar ferias");
                    } else if(quantiaCarlos >= 8000 && aprovacaoDeAninha.equalsIgnoreCase("reprovada") && feriasDaJoana){
                        System.out.println("Ana foi reprovada na escola");
                    }else{
                        System.out.println("Dois ou mais criterios não foram atingidos");
                    }
                }
            }
            System.out.print("Deseja continuar ou sair do programa? ");
            continuar = scanner.nextLine();
        }
    }
}
//System.out.println();
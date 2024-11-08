package lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, sobrenome, dataNasc, grauInstrucao, cargoPreterido, enter;
        double pretensao;
        boolean cnhB = false;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento: ");
        dataNasc = scanner.nextLine();

        System.out.print("Digite sua pretensão salarial em R$ ");
        pretensao = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite seu grau de intrução EnsinoMédio/EnsinoTécnico/EnsinoSuperior: ");
        grauInstrucao = scanner.nextLine();

        System.out.print("Digite o cargo preterido: ");
        cargoPreterido = scanner.nextLine();

        System.out.print("Digite sim se possui CNH B e não se não possui: ");
        cnhB = scanner.nextLine().equalsIgnoreCase("sim");

        //CONFIMAÇÃO
        System.out.println("\n\n\nAPERTE QUALQUER TECLA PARA FINALIZAR\n\n\n\n");
        enter = scanner.nextLine();

        //DADOS
        System.out.printf("NOME CADASTRADO: %s %s \n", nome, sobrenome);
        System.out.printf("DATA DE NASCIMENTO: %s \n", dataNasc);
        System.out.printf("PRETENSÃO SALARIAL: %.2f \n", pretensao);
        System.out.printf("GRAU DE INSTRUÇÃO: %s\n", grauInstrucao);
        System.out.printf("CARGO PRETENDIDO: %s\n", cargoPreterido);
        System.out.printf("POSSUI CNH B: %b\n", cnhB);

    }
}

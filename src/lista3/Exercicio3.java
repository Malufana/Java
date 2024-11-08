package lista3;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] classificacoes = new int[0];
        int classificacao;
        float cont = 0, ruim = 0, bom = 0, otimo = 0, medOtimo, medBom, medRuim;


//        String[] vetorClassificacao = classificacao.split(" ");
//        int[] filmes = new int[vetorClassificacao.length];

        System.out.println("BEM VINDO(A) PARA A PESQUISA DE CAMPO DO FILME");
        System.out.println("O MENU");

        while(true){
            System.out.println("O QUE VOCÊ ACHOU DO FILME?");
            System.out.println("""
                    [1] - ÓTIMO
                    [2] - BOM
                    [3] - RUIM
                    [4] - SAIR
                    """);
            classificacao = scanner.nextInt();

            if(classificacao == 4){
                break;
            }

            int[] novo = new int[classificacoes.length + 1];
            for(int i = 0; i < classificacoes.length; i++){
                novo[i] = classificacoes[i];
            }
            novo[classificacoes.length] = classificacao;

            classificacoes = novo;
        }

        for(int i = 0; i < classificacoes.length; i++){
            cont++;
            if(classificacoes[i] == 1){
                otimo++;
            } else if (classificacoes[i] == 2) {
                bom++;
            }else {
                ruim++;
            }
        }

        medOtimo = (otimo / cont) * 100;
        medBom = (bom / cont) * 100;
        medRuim = (ruim / cont) * 100;

        System.out.printf("\n\n%.0f Responderam ótimo e isso representa %.2f do todo", otimo, medOtimo);
        System.out.printf("\n\n%.0f Responderam bom e isso representa %.2f do todo", bom, medBom);
        System.out.printf("\n\n%.0f Responderam ruim e isso representa %.2f do todo", ruim, medRuim);
        System.out.printf("\n\n%.0f Responderam ao todo", cont);

//        System.out.printf(" " + Arrays.toString(classificacoes));
    }
}

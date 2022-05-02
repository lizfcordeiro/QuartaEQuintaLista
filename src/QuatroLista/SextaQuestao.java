package QuatroLista;

import java.util.Random;
import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] gabarito = new int[13];
        int[] cartaoResposta = new int[13];
        int quantidadeDeAcertos = 0;

        for (int i = 0; i < gabarito.length; i++) {
            int resposta = new Random().nextInt(3)+1;
            gabarito[i] = resposta;
            System.out.println(resposta);
        }

        System.out.println("Informe o cartão-resposta do apostador ");
        for (int i = 0; i < 13; i++) {
            cartaoResposta[i] = teclado.nextInt();
        }
        for (int i = 0; i < cartaoResposta.length; i++) {
            if (cartaoResposta[i] == gabarito[i]) {
                quantidadeDeAcertos++;
            }
        }
        System.out.println("A quantidade de acertos é " + quantidadeDeAcertos);

        if (quantidadeDeAcertos == 13) {
            System.out.println("Vencedor!");
        }
    }   }
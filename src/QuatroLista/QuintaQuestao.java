package QuatroLista;

import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int somaDaLinha = 0;

        System.out.println("Digite o número das linhas e das colunas ");
        int linhas = teclado.nextInt();
        int colunas = teclado.nextInt();
        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da sua matriz ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println("A linha escolhida é: ");
        int linhaEscolhida = teclado.nextInt();
        for (int i = linhaEscolhida; i <= linhaEscolhida; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            somaDaLinha += matriz[i][j];
        }
        }
        System.out.println("A soma da linha escolhida é " + somaDaLinha);
    }
    }

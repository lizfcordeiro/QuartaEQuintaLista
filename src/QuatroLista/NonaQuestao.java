package QuatroLista;

import java.util.Random;

public class NonaQuestao {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][5];
        int[] somaDasLinhas = new int[3];
        int[] somaDasColunas = new int[5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(20);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaDasLinhas[i] += matriz[i][j];
            }
            System.out.println(i+1);
            System.out.println(somaDasLinhas[i]);
        }
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                somaDasColunas[j] += matriz[i][j];
            }
            System.out.println(j+1);
            System.out.println(somaDasColunas[j]);
        }
    }
}

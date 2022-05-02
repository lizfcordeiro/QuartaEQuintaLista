package QuatroLista;

import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int somaValor = 0;
        int[][] matriz = new int[1][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
                somaValor += matriz[i][j];
            }
        }
        System.out.println(somaValor);
    }
}
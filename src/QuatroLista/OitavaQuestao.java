package QuatroLista;

import java.util.Scanner;
import java.util.Random;

public class OitavaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = new int[1][10];

        System.out.println("Informe o número que deseja comparar ");
        int numero = teclado.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
                if(numero == matriz[i][j]){
                    System.out.println("O valor inserido existe na matriz: " + numero);
                    break;
                } else {
                    System.out.println("==");
                }
            }
        }


    }
}

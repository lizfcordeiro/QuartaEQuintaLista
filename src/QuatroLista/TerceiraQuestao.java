package QuatroLista;

import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorMaior = Double.MIN_VALUE;
        double[][] matriz = new double[1][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextDouble();
                if (matriz[i][j] > valorMaior){
                    valorMaior = matriz[i][j];
                }
            }
            System.out.println(valorMaior);
        }
    }
}

package QuatroLista;

import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[][] matrizDeNumeros = new double[2][5];
        for (int i = 0; i < matrizDeNumeros.length; i++) {
            for (int j = 0; j < matrizDeNumeros[i].length; j++) {
                matrizDeNumeros[i][j] = teclado.nextDouble();
            }
        }
    }
}

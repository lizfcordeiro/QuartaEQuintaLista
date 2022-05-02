package QuatroLista;

import java.util.Random;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Random random = new Random();
        double[] listaDeNumeros = new double[10];
        for (int i = 0; i < 10; i++){
            listaDeNumeros[i] = random.nextDouble(100);
            System.out.println(listaDeNumeros[i]);
        }

    }
}

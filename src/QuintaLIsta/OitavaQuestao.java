package QuintaLIsta;

import java.util.Scanner;

public class OitavaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pessoas90Contador = 0;
        double media = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite a idade da pessoa: ");
            int idade = teclado.nextInt();
            media += idade;
            System.out.print("Digite o peso da pessoa: ");
            double peso = teclado.nextDouble();
            if (peso < 90) {
                pessoas90Contador++;
            }
        }
        System.out.println("Pessoa com mais de 90kg " + pessoas90Contador);
        System.out.printf("Média das idades  " + (media / 7));
    }
}

package QuintaLIsta;

import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de anos que ele fuma ");
        int anos = teclado.nextInt();

        System.out.println("Quantidade de cigarros fumados por dia ");
        int cigarros = teclado.nextInt();

        System.out.println("Preço da carteira de cigarro ");
        double valorDaCarteira = teclado.nextInt();

        int quantidadeDeCarteirasAno = (cigarros * 365) / 20;

        double valorTotalGasto = (quantidadeDeCarteirasAno * valorDaCarteira) * anos;

        System.out.println(valorTotalGasto);
    }
}

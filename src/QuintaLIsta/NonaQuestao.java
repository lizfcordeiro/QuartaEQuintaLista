package QuintaLIsta;

import java.util.Scanner;

public class NonaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua opção: 1. Média aritmética e 2. Média ponderada ");
        int opcao = teclado .nextInt();
        double somaNotas = 0;
        double somaPesos = 0;

        if (opcao == 1){
            System.out.println("Digite a primeira nota ");
            double nota1 = teclado.nextDouble();
            System.out.println("Digite a segunda nota ");
            double nota2 = teclado.nextDouble();

            double mediaAritmetica = (nota1 + nota2) / 2;
            System.out.println("Média aritmética é: " + mediaAritmetica);
        } else {
            System.out.println("Digite nota 1 ");
            double notaUm = teclado.nextDouble();
            System.out.println("Digite o peso da nota 1 ");
            double pesoUm = teclado.nextDouble();
            System.out.println("Digite nota 2 ");
            double notaDois = teclado.nextDouble();
            System.out.println("Digite o peso da nota 2 ");
            double pesoDois = teclado.nextDouble();
            System.out.println("Digite nota 3 ");
            double notaTres = teclado.nextDouble();
            System.out.println("Digite o peso da nota 3 ");
            double pesoTres = teclado.nextDouble();

            somaNotas = (notaUm * pesoUm) + (notaDois * pesoDois) + (notaTres * pesoTres);

            somaPesos = pesoUm + pesoDois + pesoTres;

            System.out.println("Média ponderada é: " + somaNotas / somaPesos);
        }

    }
}

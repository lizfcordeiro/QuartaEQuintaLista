package QuatroLista;

import java.util.Scanner;

public class DecimaTerceiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor = 0;
        double valorFinal = 0;

        System.out.println("Digite o tipo de combustível ");
        String combustivel = teclado.nextLine();

        System.out.println("Digite a quantidade de litros vendidos ");
        double litros = teclado.nextDouble();

        switch (combustivel) {
            case "A":
                if (litros <= 20){
                    valor = (litros * 5.20);
                    valorFinal = valor - (valor * 0.03);
                } else {
                    valor = (litros * 5.20);
                    valorFinal = valor - (valor * 0.05);
                }
            case "G":
                if (litros <= 20) {
                    valor = (litros * 7.59);
                    valorFinal = valor - (valor * 0.04);
                } else {
                    valor = (litros * 7.59);
                    valorFinal = valor - (valor * 0.06);
                }
                break;
        }
        System.out.println("O valor a ser pago é " + valorFinal);
    }
}

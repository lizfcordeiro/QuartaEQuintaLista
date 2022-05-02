package QuatroLista;

import java.util.Scanner;

public class DecimaSegundaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double comissao = 0;
        double salarioTotal = 0;

        System.out.println("Digite o valor do salário fixo ");
        double salario = teclado.nextDouble();

        System.out.println("Digite o valor das venda efetuadas ");
        double vendas = teclado.nextDouble();

        if (vendas < 1500) {
            comissao = (vendas * 0.03);
        } else {
            comissao = (vendas * 0.05);
        }
        salarioTotal = salario + comissao;
        System.out.println("Salário total " + salarioTotal);
    }
}

package QuatroLista;

import java.util.Scanner;

public class DecimaQuintaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroMercadoriasEstoque = 0;
        double valorTotalEstoque = 0;
        double valorTotalMercadorias = 0;

        System.out.println("Informe a quantidade de produtos que irá cadastrar ");
        int quantidadeDeProdutos = teclado.nextInt();

        for (int i = 0; i < quantidadeDeProdutos; i++) {
            teclado.nextLine();
            System.out.println("Digite o nome do produto ");
            String nomeDoProduto = teclado.nextLine();

            System.out.println("Digite o número de mercadorias no estoque ");
            int mercadoriasDoEstoque = teclado.nextInt();

            System.out.println("Digite o valor unitário do produto " + nomeDoProduto);
            double valorUnitario = teclado.nextDouble();

            valorTotalEstoque += valorUnitario * mercadoriasDoEstoque;
            valorTotalMercadorias += valorUnitario;
            numeroMercadoriasEstoque += mercadoriasDoEstoque;
        }
        System.out.println("Valor total do estoque: " + valorTotalEstoque);
        System.out.println("Média do valor das mercadorias " + (valorTotalMercadorias/quantidadeDeProdutos));
    }
}

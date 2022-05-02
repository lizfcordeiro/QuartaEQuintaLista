package QuintaLIsta;

import java.util.Scanner;

public class SetimaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double totalAVista = 0;
        double totalAPrazo = 0;
        double totalCompras = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o código do pagamento: V para a Vista e P para a Prazo: ");
            String modoDePagamento = teclado.next();
            System.out.println("Informe o valor do pagamento ");
            double valorPago = teclado.nextDouble();

            switch (modoDePagamento) {
                case "V":
                    totalAVista += valorPago;
                    totalCompras += valorPago;
                    break;
                case "P":
                    totalAPrazo += valorPago;
                    totalCompras += valorPago;
                    break;
                }
            System.out.println("O total a vista é " + totalAVista);
            System.out.println("Total a prazo é " + totalAPrazo);
            System.out.println("O total das compras é " + totalCompras);
            System.out.println("A primeira parcela a prazo é  " + totalAPrazo/ 3);
        }
    }
}
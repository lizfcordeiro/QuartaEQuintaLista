package QuatroLista;

import java.util.Scanner;

public class DecimaPrimeiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o DDD da cidade ");
        int ddd = teclado.nextInt();

        switch (ddd) {
            case 61:
                System.out.println("Brasilia");
            case 71:
                System.out.println("Salvador");
            case 11:
                System.out.println("São Paulo");
            case 21:
                System.out.println("Rio de Janeiro");
            case 32:
                System.out.println("Juiz de Fora");
            case 19:
                System.out.println("Campinas");
            case 27:
                System.out.println("Vitória");
            case 31:
                System.out.println("Belo Horizonte");
            default:
                System.out.println("DDD não cadastrado");
        }
    }
}

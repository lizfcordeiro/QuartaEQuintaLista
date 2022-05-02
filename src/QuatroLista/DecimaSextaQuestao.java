package QuatroLista;

import java.util.Scanner;

public class DecimaSextaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomes = new String[10];
        String nome;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um nome ");
            nomes[i] = teclado.nextLine();
        }
        System.out.println("Digite o nome de uma pessoa ");
        nome = teclado.next();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nome)){
                System.out.println("ACHEI");
                break;
            } else {
                System.out.println("NÃO ACHEI");
            }
        }
    }
}

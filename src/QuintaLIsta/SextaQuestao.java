package QuintaLIsta;

import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe a idade da pessoa ");
        int idade = teclado.nextInt();

        if (idade < 18 || idade > 67) {
            System.out.println("Não pode doar ");
        } else {
            System.out.println("Pode doar");
        }
    }
}

package QuintaLIsta;

import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] codigo = new String[5];
        String[] telefone = new String[5];
        int[] idade = new int[5];

        while (true) {
            int numeroDoContato = 0;
            do {
                System.out.println("Para adicionar um contato digite 1, para excluir 2");
                int opcao = teclado.nextInt();
            } while (opcao == 0);

            switch (opcao){
                case 1:
                    teclado.nextLine();
                    System.out.print("Digite o código da pessoa: ");
                    codigo[numeroDoContato] = teclado.nextLine();
                    System.out.print("Digite o número do telefone: ");
                    telefone[numeroDoContato] = teclado.nextLine();
                    System.out.print("Digite a idade da pessoa: ");
                    idade[numeroDoContator] = teclado.nextInt();
                    numeroDoContato++;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        if (codigo[i] != null){
                            System.out.println("Contato" + i+1);
                            System.out.println("Código da pessoa: " + codigo[i]);
                            System.out.println("Telefone da pessoa: " + telefone[i]);
                            System.out.println("Idade da pessoa: " + idade[i]);
                        }
                    }
                    System.out.print("Digite o número do contato que deseja deletar: ");
                    int removerContato = teclado.nextInt();
                    codigo[removerContato -1] = null;
                    telefone[removerContato -1] = null;
                    idade[removerContato -1] = 0;
                default: System.out.println("Fim");
            }
        }
    }

}


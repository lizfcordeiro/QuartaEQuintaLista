package QuatroLista;

import java.util.Scanner;

/* Escreva um código que leia um vetor G de 10 elementos do tipo caracter que representa o gabarito de uma prova. A seguir, para cada um dos 10 alunos da turma,
   leia o vetor de respostas (R) do  aluno e conte o número de acertos. Mostre o número de acertos do aluno e uma mensagem APROVADO, se a nota for maior ou igual a 6;
   e mostre uma mensagem de REPROVADO, caso contrário. */

public class SetimaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Character[] gabarito = {'A', 'B', 'C', 'D', 'A', 'E', 'C', 'D', 'B', 'E'};
        Character[][] respostasAlunos = new Character[10][10];
        int quantidadeDeAcertos = 0;

        System.out.println("Digite a resposta do estudante ");
        for (int i = 0; i < respostasAlunos.length; i++) {
            for (int j = 0; j < respostasAlunos[i].length; j++) {
                respostasAlunos[i][j] = teclado.nextLine().charAt(0);
            }
        }
        teclado.nextLine();

        for (int i = 0; i < respostasAlunos.length; i++) {
            for (int j = 0; j < respostasAlunos[i].length; j++) {
            if (gabarito[i] == respostasAlunos[i][j]) {
                quantidadeDeAcertos++;
            }
            }
        }
        teclado.nextLine();
        if (quantidadeDeAcertos >= 6) {
            System.out.println("O aluno está aprovado com nota " + quantidadeDeAcertos);
        } else {
            System.out.println("Aluno reprovado " + quantidadeDeAcertos);
        }

    }
}
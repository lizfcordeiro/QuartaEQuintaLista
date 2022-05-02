package QuatroLista;

import java.util.Scanner;

public class DecimaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Digite um número inteiro ");
        int numero = teclado.nextInt();

        for (int i = 0; i < cedulas.length; i++) {
            if(numero >= cedulas[i]){
                int quantidadeDeNotas = numero / cedulas[i];
                numero = numero%cedulas[i];
                System.out.println("O valor é " + cedulas[i] + " e as cédulas são " + quantidadeDeNotas);
            }
            
        }
    }
}

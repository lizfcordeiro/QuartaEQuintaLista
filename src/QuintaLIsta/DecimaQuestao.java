package QuintaLIsta;

import java.util.Scanner;

public class DecimaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int regularContador = 0;
        int bomContador = 0;
        int otimoContador = 0;
        int somaIdade = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Qual a sua idade? ");
            int idade = teclado.nextInt();
            System.out.println("Qual nota você dá ao filme? 1. Regular, 2. Bom e 3. Ótimo");
            int nota = teclado.nextInt();

            if (nota == 1){
                regularContador++;
            } else if (nota == 2){
                bomContador++;
            } else {
                otimoContador++;
                somaIdade += idade;
            }
        }
        int mediaIdadeOtimo =  somaIdade/otimoContador;

        System.out.println("A média das idades das pessoas que responderam ótimo é " + mediaIdadeOtimo);
        System.out.println("A quantidade de pessoas que respondeu regular é " + regularContador);
        System.out.println("A porcentagem de pessoas que respondeu “bom” entre todos os espectadores analisados é" + (bomContador*100/5) + "%");
    }
}

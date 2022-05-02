package QuatroLista;

import java.util.Scanner;

public class DecimaQuartaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int somaDasIdades = 0;
        int produtoDasIdades = 0;

        System.out.println("Digite a idade do homem 1 ");
        int idadeH1 = teclado.nextInt();

        System.out.println("Digite a idade do homem 2 ");
        int idadeH2 = teclado.nextInt();

        System.out.println("Digite a idade da mulher 1 ");
        int idadeM1 = teclado.nextInt();

        System.out.println("Digite a idade da mulher 2 ");
        int idadeM2 = teclado.nextInt();

        if (idadeH1 > idadeH2 || idadeM1 > idadeM2){
            somaDasIdades = idadeH1 + idadeM2;
            produtoDasIdades = idadeH2 * idadeM1;
        } else if (idadeH1 < idadeH2 || idadeM1 < idadeM2) {
            somaDasIdades = idadeH1 + idadeM2;
            produtoDasIdades = idadeH2 * idadeM1;
        }
        System.out.println("Soma das idades " + somaDasIdades + " produto das idades " + produtoDasIdades);
    }
}

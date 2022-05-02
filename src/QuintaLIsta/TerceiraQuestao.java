package QuintaLIsta;

import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int simContador = 0;

        System.out.println("Telefonou para a vitima? ");
        String primeiraResposta = teclado.nextLine();
        if (primeiraResposta.equals("sim")){
            simContador++;
        }
        System.out.println("Esteve no local da vitima? ");
        String segundaResposta = teclado.nextLine();
        if (segundaResposta.equals("sim")){
            simContador++;
        }
        System.out.println("“Mora perto da vítima? ");
        String terceiraResposta = teclado.nextLine();
        if (terceiraResposta.equals("sim")){
            simContador++;
        }
        System.out.println("Devia para a vítima? ");
        String quartaResposta = teclado.nextLine();
        if (quartaResposta.equals("sim")){
            simContador++;
        }
        System.out.println("Já trabalhou com a vítima? ");
        String quintaResposta = teclado.nextLine();
        if (quintaResposta.equals("sim")){
            simContador++;
        }
        switch (simContador){
            case 2:
                System.out.println("Suspect");
            case 3, 4:
                System.out.println("Accomplice");
            case 5:
                System.out.println("Assassin");
            default:
                System.out.println("Innocent");
        }
    }
}

package QuintaLIsta;

import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double diferencaDasVelocidades = 0;

        System.out.println("Informe a velocidade do motorista ");
        double velocidadeDoMotorista = teclado.nextDouble();

        System.out.println("Informe a velocidade permitida na avenida ");
        double velocidadePermitida = teclado.nextDouble();

        diferencaDasVelocidades = velocidadeDoMotorista - velocidadePermitida;

        if (diferencaDasVelocidades <= 10){
            System.out.println("O motorista terá que pagar 50 reais ");
        } else if(diferencaDasVelocidades <= 30){
            System.out.println("O motorista terá que pagar 100 reais ");
        } else if (diferencaDasVelocidades > 31) {
            System.out.println("O motorista terá que pagar 200 reais");

        }
    }
}

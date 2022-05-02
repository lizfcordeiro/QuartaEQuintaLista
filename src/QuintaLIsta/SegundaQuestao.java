package QuintaLIsta;

import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioLiquido;

        System.out.println("Informe o valor da sua hora ");
        double valorHora = teclado.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês ");
        int horasTrabalhadasMes = teclado.nextInt();

        double salarioBruto = valorHora * horasTrabalhadasMes;
        double fgts = salarioBruto * 0.11;
        double sindicato = salarioBruto * 0.03;

        if (salarioBruto <= 900){
            salarioLiquido = salarioBruto - sindicato;
            System.out.println("Salário liquido: " + (salarioLiquido));
            System.out.println("FGTS " + fgts);
        } else if(salarioBruto <= 1500){
            salarioLiquido = (salarioBruto - (salarioBruto * 0.05)) - sindicato;
            System.out.println("Salário liquido: " + (salarioLiquido));
            System.out.println("FGTS " + fgts);
        } else if(salarioBruto <= 2500){
            salarioLiquido = (salarioBruto - (salarioBruto * 0.10)) - sindicato;
            System.out.println("Salário liquido: " + (salarioLiquido));
            System.out.println("FGTS " + fgts);
        } else if(salarioBruto > 2500){
            salarioLiquido = (salarioBruto - (salarioBruto * 0.20)) - sindicato;
            System.out.println("Salário liquido: " + (salarioLiquido));
            System.out.println("FGTS " + fgts);
        }
    }
}

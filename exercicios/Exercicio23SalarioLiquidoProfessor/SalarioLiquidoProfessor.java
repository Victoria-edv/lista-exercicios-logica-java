package Exercicio23SalarioLiquidoProfessor;

import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquidoProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valor por hora aula: ");
        double valorHoraAula = sc.nextDouble();
        System.out.print("Horas de aula: ");
        double horasDeAulas = sc.nextDouble();

        double totalParcial = valorHoraAula * horasDeAulas;

        if (totalParcial < 1.518) {
            double imposto = totalParcial * 0.075;
            double totalFinal = totalParcial - imposto;
            System.out.println("Salário Líquido - R$" + totalFinal);
        } else if (totalParcial > 1.518 && totalParcial < 2.793) {
            double imposto = totalParcial * 0.09;
            double totalFinal = totalParcial - imposto;
            System.out.println("Salário Líquido - R$" + totalFinal);
        } else if (totalParcial > 2.793 && totalParcial < 4.190) {
            double imposto = totalParcial * 0.12;
            double totalFinal = totalParcial - imposto;
            System.out.println("Salário Líquido - R$" + totalFinal);
        } else {
            double imposto = totalParcial * 0.14;
            double totalFinal = totalParcial - imposto;
            System.out.printf("Salário Líquido - R$%.2f", totalFinal);
        }
        sc.close();
    }
}

package Exercicio05SalariosMinimos;

import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo= 1293.20;

        System.out.print("Digite o valor do seu salario:");
        double salarioUsuario= sc.nextDouble();

        double media= salarioUsuario/salarioMinimo;

        System.out.printf("Você recebe %.2f salario(s) mínimo(s)", media);

        sc.close();
    }
}

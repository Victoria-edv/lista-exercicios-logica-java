package Exercicio11AprovadoReprovado;

import java.util.Locale;
import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Qual o seu nome? ");
        String nome = sc .nextLine();
        System.out.print("Digite sua 1º nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite sua 2º nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite sua 3º nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite sua 4º nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.printf(Locale.US,"A média é: %.2f\n ", media);

        if (media>=7){
            System.out.println(nome+ ", você está aprovado(a)!");
        } else {
            System.out.println(nome+", você está reprovado(a)!");
        }
        sc.close();
    }
}

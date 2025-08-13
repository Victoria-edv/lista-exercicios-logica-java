package Exercicio10MediaNotas;

import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Digite sua 1º nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite sua 2º nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite sua 3º nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.printf("A média é: %.2f ", media);

        sc.close();
    }
}

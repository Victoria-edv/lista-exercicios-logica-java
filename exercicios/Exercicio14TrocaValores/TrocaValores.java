package Exercicio14TrocaValores;

import java.util.Locale;
import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Digite um valor para A: ");
        int A = sc.nextInt();
        System.out.print("Digite um valor para B: ");
        int B = sc.nextInt();

        System.out.println("Valores originais: "+ A +" para A e " + B + " para B");

        System.out.println("-------------------------------------");

        int troca = A;
        A=B;
        B=troca;

        System.out.println("O valor de A agora é: " + A);
        System.out.println("O valor de B agora é: " + B);
        sc.close();
    }
}

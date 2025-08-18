package Exercicio19TabuadaCompleta;

import java.util.Locale;
import java.util.Scanner;

public class TabuadaCompleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Imprimindo a calculadora de 1 até 10 na tela: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + "=" + (i * j));
            }
            System.out.println();
            sc.close();
        }
    }
}

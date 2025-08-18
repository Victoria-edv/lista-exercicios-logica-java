package Exercicio20TabuadaDeUmNumero;

import java.util.Locale;
import java.util.Scanner;

public class TabuadaDeUmNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        System.out.print("Tabuada do " + valor + ": ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        sc.close();

    }
}

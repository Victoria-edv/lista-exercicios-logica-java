package Exercicio09CalculoIMC;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura (em metros, ex: 1.55) ");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.printf("%.2f\n", IMC);

        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (IMC <= 34.9) {
            System.out.println("Obesidade grau I ");
        } else if (IMC <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else  {
            System.out.println("Obesidade grau III (mórbida)");
        }
        sc.close();
    }
}


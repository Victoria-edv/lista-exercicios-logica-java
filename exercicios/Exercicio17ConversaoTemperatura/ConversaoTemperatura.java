package Exercicio17ConversaoTemperatura;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite uma temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Em Fahrenheit é: %.2fºF e em Celsius: %.2fºC", fahrenheit, celsius);

        sc.close();
    }
}

package Exercicio24LitrosCombustivel;

import java.util.Locale;
import java.util.Scanner;

public class LitrosCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println(" - Calculadora de Gastos de Viagem - ");
        System.out.print("Qual o tempo de viagem (em horas)? ");
        double tempo = sc.nextDouble();
        System.out.print("Qual a velocidade média (em km/h)? ");
        double velocidadeMedia = sc.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double litros = distancia/12;

        System.out.println(" - Detalhes - ");
        System.out.printf("Tempo gasto: %.2f horas\n", tempo);
        System.out.printf("Velocidade média: %.2f km/h\n", velocidadeMedia);
        System.out.printf("Distância percorrida: %.2f km\n", distancia);
        System.out.printf("Litros de combustível utilizados: %.2f L\n", litros);

        sc.close();
    }
}

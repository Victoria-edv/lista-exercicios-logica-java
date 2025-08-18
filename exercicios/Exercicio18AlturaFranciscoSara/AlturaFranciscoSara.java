package Exercicio18AlturaFranciscoSara;

import java.util.Locale;
import java.util.Scanner;

public class AlturaFranciscoSara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Francisco tem 1,50m e cresce 2 centímetros por ano e Sara tem 1,10m e cresce 3 centímetros por ano");
        double Francisco = 1.50;
        double Sara = 1.10;
        int ano = 0;

        while (Francisco > Sara) {
            ano = ano + 1;
            Francisco = Francisco + 0.02;
            Sara = Sara + 0.03;
        }

        System.out.println("Será necessário " + ano + " anos");

        sc.close();
    }
}

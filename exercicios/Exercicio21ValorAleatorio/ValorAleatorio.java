package Exercicio21ValorAleatorio;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ValorAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Selecionando um valor aleatório");

        Random gerador = new Random();
        int valorAleatorio = gerador.nextInt(101);

        System.out.println("O valor aleatório entre 0 e 100 foi... " + valorAleatorio + " !!!!");

        sc.close();
    }
}

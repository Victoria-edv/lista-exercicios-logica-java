package Exercicio13Maioridade;

import java.util.Locale;
import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Seu nome é "+ nome);
        if (idade<18){
            System.out.println(" e você é menor de idade!");
        } else {
            System.out.println(" e você é maior de idade!");
        }
        sc.close();
    }
}

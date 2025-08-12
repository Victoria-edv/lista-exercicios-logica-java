package Exercicio02ParOuImpar;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero qualquer: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }
        if (numero == 0) {
            System.out.println("O número é zero.");
        } else if (numero > 0) {
            System.out.println("E positivo.");
        } else {
            System.out.println("E negativo.");
        }

        sc.close();
    }
}

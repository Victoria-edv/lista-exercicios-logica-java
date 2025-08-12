package Exercicio04AntecessorSucessor;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.print("Seu antecessor: " + antecessor + " e o seu sucessor: "+ sucessor);

        sc.close();
    }
}

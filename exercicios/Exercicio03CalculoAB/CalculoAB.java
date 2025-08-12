package Exercicio03CalculoAB;

import java.util.Scanner;

public class CalculoAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para A: ");
        int A = sc.nextInt();
        System.out.print("Digite um valor para B: ");
        int B = sc.nextInt();
        if (A == B){
            int soma = A+B;
            System.out.println("A soma dos valores é: "+ soma);
        }
        sc.close();
    }
}

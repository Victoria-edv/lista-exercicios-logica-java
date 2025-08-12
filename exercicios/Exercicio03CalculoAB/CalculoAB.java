package Exercicio03CalculoAB;

import java.util.Scanner;

public class CalculoAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para A: ");
        int A = sc.nextInt();
        System.out.print("Digite um valor para B: ");
        int B = sc.nextInt();

        int C;

        if (A == B){
             C = A+B;
        } else {
             C = A*B;
        }

        // Imprime o valor final de C
        System.out.println("O valor final de C é: " + C);
        sc.close();
    }
}

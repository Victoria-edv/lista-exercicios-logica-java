package Exercicio01SomaMenorQueC;

import java.util.Scanner;

public class SomaMenorQueC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para A: ");
        int A = sc.nextInt();
        System.out.println("Digite um valor para B: ");
        int B = sc.nextInt();
        System.out.println("Digite um valor para C: ");
        int C = sc.nextInt();
        int soma = A+B;
        if (soma<C){
            System.out.println("A soma de A e B é menor que C");
        }
        else {
            System.out.println("A soma de A e B é maior que C");
        }
    }
}

package Exercicio08OrdemDecrescente;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int A = sc.nextInt();
        System.out.print("Digite um número: ");
        int B = sc.nextInt();
        System.out.print("Digite um número: ");
        int C = sc.nextInt();

        if (A>B && A>C) {
            System.out.println(A);
            if (B > C){
                System.out.println(B);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(B);
            }

        } else if (B>A && B>C) {
            System.out.println(B);
            if (C > A){
                System.out.println(C);
                System.out.println(A);
            } else {
                System.out.println(A);
                System.out.println(C);

            }
        } else {
            System.out.println(C);
            if (B > A){
                System.out.println(B);
                System.out.println(A);

            } else {
                System.out.println(A);
                System.out.println(B);
            }
        }

    }
}

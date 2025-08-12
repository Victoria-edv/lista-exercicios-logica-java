package Exercicio07ValoresBooleanos;

import java.util.Scanner;

public class ValoresBooleanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor booleano (true ou false): ");
        boolean valor = sc.nextBoolean();
        System.out.print("Digite novamente um valor booleano (true ou false): ");
        boolean valor2 = sc.nextBoolean();
        if (valor && valor2) {
            System.out.println("Ambos são true, ou seja, é verdadeiro");
        }
        else if (!valor && !valor2) {
            System.out.println("Ambos são falso , ou seja, é false");
        } else {
            System.out.println("Os valores são diferentes (um é verdadeiro e o outro é falso).");
        }
        sc.close();
    }
}

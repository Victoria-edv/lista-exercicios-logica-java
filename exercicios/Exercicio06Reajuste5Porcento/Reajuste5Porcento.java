package Exercicio06Reajuste5Porcento;

import java.util.Scanner;

public class Reajuste5Porcento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();
        double reajuste = valor + valor*0.05;

        System.out.println("Seu valor com reajuste de 5% é: "+ reajuste);

        sc.close();
    }
}

package Exercicio16TipoTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Digite um valor para 1º lado do triângulo: ");
        int lado1 = sc.nextInt();
        System.out.print("Digite um valor para 2º lado do triângulo: ");
        int lado2 = sc.nextInt();
        System.out.print("Digite um valor para 3º lado do triângulo: ");
        int lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }
        sc.close();
    }
}

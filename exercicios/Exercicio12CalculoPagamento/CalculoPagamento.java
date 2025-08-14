package Exercicio12CalculoPagamento;

import java.util.Locale;
import java.util.Scanner;

public class CalculoPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Qual o valor do seu produto? ");
        double valor = sc.nextDouble();
        System.out.println("Qual a forma de pagamento?");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        double valorFinal = 0;
        boolean codigoInvalido = false;
        int codigoPagamento = sc.nextInt();
        switch (codigoPagamento) {
            case 1:
                valorFinal = valor - valor * 0.15;
                break;
            case 2:
                valorFinal = valor - valor * 0.10;
                break;
            case 3:
                valorFinal = valor;
                break;
            case 4:
                valorFinal = valor + valor * 0.10;
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                codigoInvalido = true;
        }
        if (!codigoInvalido) {
            System.out.printf("Valor Final da compra: R$%.2f", valorFinal);
        }
        sc.close();
    }
}

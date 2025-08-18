package Exercicio15TempoDeVida;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Em que ano você nasceu? ");
        int anoNasc = sc.nextInt();

        // Dados fixos de referência para o cálculo
        int anoAtual = 2025;
        int mesAtual = 8;
        int diaAtual = 18;

        // O cálculo assume que a pessoa nasceu em 01/01 do seu ano de nascimento.
        int anosCompletos = anoAtual - anoNasc;
        int diasPassadosAnoAtual = (mesAtual - 1) * 30 + diaAtual;
        int totalDias = (anosCompletos * 365) + diasPassadosAnoAtual;

        int anos = totalDias / 365;
        int diasRestantes = totalDias % 365;

        int meses = diasRestantes / 30;
        int dias = diasRestantes % 30;

        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de vida.");

        sc.close();
    }
}

package Exercicio22QuocienteResto;

import java.util.Locale;
import java.util.Scanner;

public class QuocienteResto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor para A: ");
        int A = sc.nextInt();
        System.out.print("Digite um valor para B: ");
        int B = sc.nextInt();

        int quociente = A/B;
        System.out.print("Quociente: "+ quociente );

        int resto = A % B;
        System.out.print("Resto: " + resto);

        sc.close();
    }
}

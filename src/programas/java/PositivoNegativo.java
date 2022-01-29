package programas.java;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.print("Digite um valor: ");
        valor = scan.nextInt();

        if (valor >= 0){
            System.out.println(valor + " é um valor POSITIVO.");
        } else {
            System.out.println(valor + " é um valor NEGATIVO.");
        }

    }
}

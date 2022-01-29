package programas.java;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        int num1, num2;

        System.out.print("Informe o primeiro número: ");
        num1 = n.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = n.nextInt();

        if (num1 > num2){
            System.out.println("Maior número informado foi: " + num1);
        } else {
            System.out.println("Maior número informado foi: " + num2);
        }

    }
}

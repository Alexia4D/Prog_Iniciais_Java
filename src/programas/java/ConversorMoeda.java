package programas.java;

import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner dl = new Scanner(System.in);
        float real, cot, dolar;
        cot = 5.37f;

        System.out.println("--------------------------------");
        System.out.println("      CONVERSOR DE MOEDA        ");
        System.out.println(" > COTAÇÃO DO DÓLAR: R$ 5,37 < ");
        System.out.println("--------------------------------");

        System.out.print("Deseja converter quantos reais? R$ ");
        real = dl.nextFloat();
        dolar = real/cot;
        System.out.printf("R$ " + real + " convertido em dólar: US$ %.2f", dolar);


    }
}

package programas.java;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in);
        double TempC, Fh;

        System.out.print("Informe a temperatura em graus Celsius: ");
        TempC = tp.nextDouble();
        Fh = TempC * 1.8 + 32;
        System.out.printf(TempC + "º Celsius equivale à: %.2f ºF (Fahrenheit) ", Fh);

    }
}

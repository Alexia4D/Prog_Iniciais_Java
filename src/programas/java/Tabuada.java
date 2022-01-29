package programas.java;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner tb = new Scanner(System.in);
        int num;

        System.out.print("Deseja ver a tabuada de qual número? ");
        num = tb.nextInt();

        System.out.println("------------------");
        System.out.println("  TABUADA DO " + num);
        System.out.println("------------------");

        for (int cont = 1; cont <= 10; cont++){
            System.out.println(num + " X " + cont + " = " + (num*cont));
        }

        }
}

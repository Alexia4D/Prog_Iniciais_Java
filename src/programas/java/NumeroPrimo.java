package programas.java;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, cont, contDiv;
        cont = 1;
        contDiv = 0;

        System.out.print("Informe um número: ");
        num = scan.nextInt();
        do {
            if (num % cont == 0){
                contDiv = contDiv + 1;

            }cont = cont + 1;

        } while (cont <= num);
        if (contDiv > 2){
            System.out.println(num + " NÃO é um número PRIMO");
        } else {
            System.out.println(num + " é um número PRIMO");
        }


    }
}

package programas.java;

public class SeqFibonacci {
    public static void main(String[] args) {
        int n1, n2, f;
        n1 = 0;
        n2 = 1;

        System.out.println("------- SEQUÊNCIA DE FIBONACCI -------");
        System.out.print(n1 + " | " + n2);
        for (int c = 3; c <= 15; c++) {
            f = n1 + n2;

            System.out.print(" | " + f);
            n1 = n2;
            n2 = f;

        }
        }
}

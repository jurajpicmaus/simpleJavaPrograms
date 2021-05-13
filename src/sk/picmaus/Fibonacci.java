package sk.picmaus;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj kolke cislo Fibonacciho postupnosti");
        int pocet = vstup.nextInt();
        vstup.close();
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i <= pocet - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println(pocet + ". cislom Fibonacciho postupnosti je cislo " + c);
    }
}

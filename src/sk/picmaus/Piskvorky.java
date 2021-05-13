package sk.picmaus;

import java.util.Scanner;

public class Piskvorky {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj rozmer hracieho pola");
        int strana = vstup.nextInt();
        vstup.close();
        System.out.print("+");
        for (int i = 1; i <= strana; i++) {
            System.out.print("---+");
        }
        for (int i = 1; i <= strana; i++) {
            System.out.println();
            System.out.print("|");
            for (int j = 1; j <= strana; j++){
                System.out.print("   |");

            }
            System.out.println();
            System.out.print("+");
            for (int j = 1; j <= strana; j++) {
                System.out.print("---+");
            }
        }
    }
}
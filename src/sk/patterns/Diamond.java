package sk.patterns;

import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int karat;
        do {
            System.out.println("Zadaj neparne cislo ako pocet riadkov diamantu");
            karat = input.nextInt();
            if (karat % 2 == 0) {
                System.out.println("Zadal si parne cislo, diamant nemoze mat parny pocet riadkov\nVyskusaj znova");
                System.out.println();
            }
        } while (karat % 2 == 0);
        int polka = karat / 2 + 1;
        drawDiamond(polka);
    }

    static void drawDiamond(int a){
        int polka = a;
        for (int i=1; i<=polka; i++){
            for (int j=i; j<=polka; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            for (int l=1; l<i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<polka; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < polka; k++) {
                System.out.print("*");
            }
            for (int l = i; l < polka - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

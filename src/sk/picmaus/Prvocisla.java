package sk.picmaus;

import java.util.Scanner;

public class Prvocisla {

    public static void main(String[] args) {
        int num;
        double pom;
        int pom2;
        int i = 2;
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj cislo");
        num = vstup.nextInt();
        if (num <= 1) {
            System.out.println("Zadane cislo nie je prvocislo");
        } else {
            do {
                pom = num % i;
                pom2 = i;
                i++;
            } while (pom != 0);

            if (pom2 == num) {
                System.out.println("Zadane cislo je prvocislo");
            } else {
                System.out.println("Zadane cislo nie je prvocislo");
            }
        }
        vstup.close();
    }
}

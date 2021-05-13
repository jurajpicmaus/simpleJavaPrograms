package sk.picmaus;

import java.util.Scanner;

public class SumaAPriemer {

    public static void main(String[] args) {
        double num;
        double sum = 0;
        int podm;
        double avg = 0;
        int n = 5;
        Scanner vstup = new Scanner(System.in);

        do {
            for (int i = 1; i <= n; i++) {

                System.out.println("Zadaj cislo");
                num = vstup.nextDouble();
                sum = sum + num;
            }
            avg++;
            System.out.println("Ak chces skoncit stlac -1 ak chces pokracovat stlac hocijake cislo");
            podm = vstup.nextInt();

        } while (podm != -1);

        System.out.println("Suma zadanych " + n + "-tich cisel je " + sum);
        System.out.println("Ich priemer je " + sum / (avg * 5));
        vstup.close();
    }
}

package sk.picmaus;

import java.util.Scanner;

public class AbsolutnaHodnota {

    public static void main(String[] args) {
        double num;
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj cislo");
        num = vstup.nextDouble();

        if (num >= 0) {
            System.out.println("Absolutna hodnota zadaneho cisla je " + num);
        } else {
            System.out.println("Absolutna hodnota zadaneho cisla je " + -num);
        }
        vstup.close();
    }
}

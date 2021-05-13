package sk.picmaus;

import java.util.Scanner;

public class NajvacsieCislo {

    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        num1 = vstup.nextDouble();
        System.out.println("Zadaj druhe cislo");
        num2 = vstup.nextDouble();
        System.out.println("Zadaj tretie cislo");
        num3 = vstup.nextDouble();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Najvacsie cislo je " + num1);
            } else {
                System.out.println("Najvacsie cislo je " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("Najvacsie cislo je " + num2);
        } else {
            System.out.println("Najvacsie cislo je " + num3);
        }
        vstup.close();
    }
}

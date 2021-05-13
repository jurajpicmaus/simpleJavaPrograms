package sk.picmaus;

import java.util.Random;
import java.util.Scanner;

public class Ncisel {

    public static void main(String[] args) {
        int n, num;
        int zapmax = 0;
        int kladmax = 0;
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj pocet opakovani");
        n = vstup.nextInt();
        for (int i = 1; i <= n; i++) {
            Random random = new Random();
            num = random.nextInt(500 + 500) - 500;
            System.out.println(num);
            if (num <= 0) {
                num = -num;
                if (num > zapmax) {
                    zapmax = num;
                }
            } else {
                if (num > kladmax) {
                    kladmax = num;
                }
            }
        }
        if (zapmax > kladmax) {
            System.out.println(
                    "Nahodne som vybral " + n + " cisel z intervalu (-500,500) z ktorych cislo s najvacsou absolutnou hodnotou je zaporne cislo " + -zapmax);
        } else {
            System.out.println(
                    "Nahodne som vybral " + n + " cisel z intervalu (-500,500) z ktorych cislo s najvacsou absolutnou hodnotou je kladne cislo " + kladmax);
        }
        vstup.close();
    }
}

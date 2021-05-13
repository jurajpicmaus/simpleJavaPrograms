package sk.picmaus;

import java.util.Scanner;

public class PozdravOdCasu {

    public static void main(String[] args) {
        double cas;
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj cas v hodinach");
        cas = vstup.nextDouble();
        if (cas < 0) {
            System.out.println("Neplatny rozsah hodin. Pripustne hodnoty su 0 az 23");
        } else if (cas <= 11) {
            System.out.println("Dobre rano");
        } else if (cas <= 17) {
            System.out.println("Dobry den");
        } else if (cas <= 23) {
            System.out.println("Dobry vecer");
        } else {
            System.out.println("Neplatny rozsah hodin. Pripustne hodnoty su 0 az 23");
        }
        vstup.close();
    }
}

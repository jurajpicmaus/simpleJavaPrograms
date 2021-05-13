package sk.picmaus;

import java.util.Scanner;

public class Gula {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        double povrch;
        double obj;
        String podm;
        do {
            System.out.println("Ak chces vypocitat povrch gule zadaj: p, ak objem gule zadaj: o");
            String odpoved = vstup.next();
            System.out.println("Zadaj priemer gule");
            double priemer = vstup.nextDouble();
            double polomer = priemer/2;
            if (odpoved.equals("p")) {
                povrch = 4*3.14*polomer*polomer;
                System.out.println("Povrch gule je " + povrch);
            }else {
                obj = (4*3.14*polomer*polomer*polomer)/3;
                System.out.println("Objem gule je " + obj);
            }
            System.out.println("Chces pokracovat? a/n");
            podm = vstup.next();
        } while (podm.equals("a"));
        vstup.close();

    }
}

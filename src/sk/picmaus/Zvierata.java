package sk.picmaus;

import java.util.Arrays;
import java.util.Scanner;

public class Zvierata {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        String[] pole = new String[5];
        System.out.println("Chcem aby si zadal 5 zvierat");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Zadaj " + (i+1) + ". zviera");
            pole[i] = vstup.next();
        }
        System.out.println("Zadal si nasledovne zvierata: " + (Arrays.toString(pole)));
    }
}

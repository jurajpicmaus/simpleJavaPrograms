package sk.picmaus;

import java.util.Arrays;
import java.util.Scanner;

public class Polia {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        int[] pole1 = new int[5];
        int[] pole2 = new int[5];
        System.out.println("Zadaj cele cisla do prveho 5-prvkoveho pola");
        for (int i = 0; i < 5; i++) {
            System.out.println("Zadaj " + (i) + ". prvok prveho pola");
            pole1[i] = vstup.nextInt();
        }
        System.out.println("Zadaj cele cisla do druheho 5-prvkove pola");
        for (int i = 0; i < 5; i++) {
            System.out.println("Zadaj " + (i) + ". prvok druheho pola");
            pole2[i] = vstup.nextInt();
        }
        vstup.close();
        System.out.println(Arrays.toString(pole1));
        System.out.println(Arrays.toString(pole2));
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            if (pole1[i] != pole2[i]) {
                System.out.println("Polia nie su totozne");
                break;
            }else {
                counter++;
            }
        }
        if (counter == 5) {
            System.out.println("Polia su totozne");
        }
    }
}

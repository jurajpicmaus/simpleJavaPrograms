package sk.picmaus;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj ciselny retazec");
        String retazec = vstup.next();
        vstup.close();
        int dlzka = retazec.length();
        int[] pole = new int[dlzka];
        for (int i = 0; i < dlzka; i++){
            char znak = retazec.charAt(i);
            int cislo = Character.getNumericValue(znak);
            pole[i] = cislo;
        }
        int max = pole[0];
        int maxpoz = 0;
        for (int i = 1; i < dlzka; i++) {
            if (pole[i] > max) {
                max = pole[i];
                maxpoz = i;
            }
        }
        int min = pole[0];
        int minpoz = 0;
        for (int i = 1; i < dlzka; i++) {
            if (pole[i] < min) {
                min = pole[i];
                minpoz = i;
            }
        }
        System.out.println("Zadal si pole cisel: " + Arrays.toString(pole));
        System.out.println("Maximalna hodnota v poli je " + max + " na pozicii " + maxpoz);
        System.out.println("Minimalna hodnota v poli je " + min + " na pozicii " + minpoz);

    }
}

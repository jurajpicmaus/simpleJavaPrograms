package sk.picmaus;

import java.util.Arrays;
import java.util.Scanner;

public class PriemerPrvkovPola {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj ciselny retazec");
        String retazec = vstup.next();
        vstup.close();
        int dlzka = retazec.length();
        int[] pole = new int[dlzka];
        double sum = 0;
        for (int i = 0; i < dlzka; i++) {
            char znak = retazec.charAt(i);
            int cislo = Character.getNumericValue(znak);
            pole[i] = cislo;
            sum = sum + cislo;
        }
        double avg = sum/dlzka;
        System.out.println("Zadal si ciselne pole " + Arrays.toString(pole));
        System.out.println("Priemer prvkov zadaneho pola je " + avg);
    }
}

package sk.picmaus;

import java.util.Arrays;
import java.util.Scanner;

public class OpacnePoradie {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj alfanumericky retazec");
        String retazec = vstup.next();
        vstup.close();
        int dlzka = retazec.length();
        char[] pole = new char[dlzka];
        for (int i = 0; i < dlzka; i++){
            char znak = retazec.charAt(i);
            pole[i] = znak;
        }
        System.out.println("Zadal si pole znakov: " + Arrays.toString(pole));
        System.out.println("Znaky pola v opacnom poradi:");
        for (int i = dlzka-1; i >= 0; i--) {
            System.out.print(pole[i] + " ");
        }
    }
}

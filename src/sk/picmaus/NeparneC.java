package sk.picmaus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NeparneC {

    public static void main(String[] args) {

        int num;
        List<Integer> list = new ArrayList<Integer>();
        Scanner vstup = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Zadaj cislo");
            num = vstup.nextInt();
            if (num % 2 != 0) {
                list.add(num);
            }
        }
        if (list.isEmpty()) {
            System.out.println("Nezadal si ziadne neparne cisla");
        } else {
            System.out.println("Zadal si tieto neparne cisla " + list);
        }
        vstup.close();
    }
}

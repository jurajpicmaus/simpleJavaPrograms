package sk.patterns;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj pocet stupnov pyramidy");
        int stupne = input.nextInt();

        for (int i=1; i<=stupne; i++){
            for (int j=i; j<=stupne; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            for (int l=1; l<i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

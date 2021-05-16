package sk.juro;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        double numberOne = input.nextDouble();
        System.out.println("Zadaj druhe cislo");
        double numberTwo = input.nextDouble();
        int checkPoint;
        do{
            checkPoint =0;
            System.out.println("Aku operaciu chces vykonat?\n a)scitanie\n b)odcitanie\n c)nasobenie\n d)delenie");
            String znak = input.next();

            switch (znak) {
                case "a":
                    double vysledok = Operacie.add(numberOne, numberTwo);
                    System.out.println("Vysledok scitania je " + vysledok);
                    break;
                case "b":
                    vysledok = Operacie.subtract(numberOne, numberTwo);
                    System.out.println("Vysledok odcitania je " + vysledok);
                    break;
                case "c":
                    vysledok = Operacie.multiply(numberOne, numberTwo);
                    System.out.println("Vysledok nasobenia je " + vysledok);
                    break;
                case "d":
                    vysledok = Operacie.divide(numberOne, numberTwo);
                    System.out.println("Vysledok delenia je " + vysledok);
                    break;
                default:
                    System.out.println("Nevybral si si ziadnu operaciu\nVyskusaj znova");
                    System.out.println();
                    checkPoint=1;
            }
        }while (checkPoint==1);
    }
}

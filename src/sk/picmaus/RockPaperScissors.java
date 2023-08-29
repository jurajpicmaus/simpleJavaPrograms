package sk.picmaus;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] pole = {"Rock", "Paper", "Scissors"};

        System.out.println("What's your name, Toots?");
        String name = scan.nextLine();

        System.out.println("Hello " +name+ " we are going to play rock, paper, scissors.");
        System.out.println("Select your choice, I will randomly select mine.");

        int checkpoint = 0;
        do {
            System.out.println("r-rock\np-paper\ns-scissors\n");
            String yourChoice = scan.nextLine();

            checkpoint = 0;
            switch (yourChoice) {
                case "r":
                    System.out.println("You selected: Rock");
                    break;
                case "p":
                    System.out.println("You selected: Paper");
                    break;
                case "s":
                    System.out.println("You selected: Scissors");
                    break;
                default:
                    System.out.println("You did not select your choice");
                    checkpoint = 1;

            }
        }while (checkpoint == 1) ;

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String myChoice = pole[randomNumber];
        System.out.println("I have selected: " +myChoice);



    }
}

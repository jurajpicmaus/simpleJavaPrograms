package sk.picmaus;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        String[] pole = {"Rock", "Paper", "Scissors"};

        System.out.println("What's your name, Toots?");
        String name = scan.nextLine();

        System.out.println("Hello " +name+ " we are going to play rock, paper, scissors.");
        System.out.println("Select your choice, I will randomly select mine.");

        int checkpoint = 0;
        String yourChoice;
        do {
            System.out.println("r-rock\np-paper\ns-scissors\n");
            yourChoice = scan.nextLine();

            checkpoint = 0;
            switch (yourChoice) {
                case "r":
                    System.out.println("You have selected: Rock");
                    break;
                case "p":
                    System.out.println("You have selected: Paper");
                    break;
                case "s":
                    System.out.println("You have selected: Scissors");
                    break;
                default:
                    System.out.println("You did not select your choice");
                    checkpoint = 1;

            }
        }while (checkpoint == 1) ;

        Thread.sleep(1000);

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String myChoice = pole[randomNumber];
        System.out.println("I have selected: " +myChoice);

        Thread.sleep(1000);

        if (yourChoice.equals("r") && myChoice.equals("Scissors")){
            System.out.println("You won");
        } else if (yourChoice.equals("r") && myChoice.equals("Paper")) {
            System.out.println("I won");
        }else if (yourChoice.equals("r") && myChoice.equals("Rock")){
            System.out.println("It is a draw");
        }

        if (yourChoice.equals("p") && myChoice.equals("Rock")){
            System.out.println("You won");
        } else if (yourChoice.equals("p") && myChoice.equals("Scissors")) {
            System.out.println("I won");
        }else if (yourChoice.equals("p") && myChoice.equals("Paper")){
            System.out.println("It is a draw");
        }

        if (yourChoice.equals("s") && myChoice.equals("Paper")){
            System.out.println("You won");
        } else if (yourChoice.equals("s") && myChoice.equals("Rock")) {
            System.out.println("I won");
        }else if (yourChoice.equals("s") && myChoice.equals("Scissors")){
            System.out.println("It is a draw");
        }
    }
}

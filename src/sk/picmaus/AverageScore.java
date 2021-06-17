package sk.picmaus;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageScore {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double avg = countAverage(createList());
        finalScore(avg);

    }
    static double enterMark(){
        System.out.println("Enter your mark from 1 to 5");
        double mark = input.nextInt();
        return mark;
    }
    static ArrayList createList(){
        ArrayList<Double> list = new ArrayList<Double>();
        String ans;
        do {
            list.add(enterMark());
            System.out.println("Do you want to enter another mark?\ny/n");
            ans = input.next();
        }while (!ans.equals("n"));
        return list;
    }
    static double countAverage(ArrayList<Double> array){
        int lenght = array.size();
        double sum = 0;
        for (int i=0; i<lenght; i++){
            sum = sum + array.get(i);
        }
        double avg = sum/lenght;
        return avg;
    }
    static void finalScore(double number){
        if (number>= 4.5){
            System.out.println("Your final score is 5");
        }else if (number>=3.5){
            System.out.println("Your final score is 4");
        }else if (number>=2.5){
            System.out.println("Your final score is 3");
        }else if (number>=1.5){
            System.out.println("Your final score is 2");
        }else {
            System.out.println("Your final score is 1");
        }
    }
}

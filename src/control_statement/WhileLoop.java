package control_statement;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        int number;
        int trial=0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess The number");
        number = (int)(Math.random()*1000+1);

        do {
            System.out.println("Enter the number");
            guess = scanner.nextInt();
            trial++;
            if(guess>number){
                System.out.println("Too high");
            }else if(guess<number){
                System.out.println("Too low");
            }else {
                System.out.println("You guess correct number and trial"+trial);
            }

        }while (guess != number);

    }
}


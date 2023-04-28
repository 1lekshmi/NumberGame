package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100) + 1;
        boolean rightGuess = false;

        for (int i = 10; i > 0; i--){
            System.out.println("Guess the number: ");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            if (number > guess){
                System.out.println("It is greater than " + guess);
            } else if (number < guess) {
                System.out.println("It is less than " + guess);
            } else {
                rightGuess = true;
                break;
            }
        }

        if (rightGuess){
            System.out.println("You guessed correctly!!");
        } else {
            System.out.println(" You've ran out of guesses.\n The correct number was " + number);
        }

    }
}
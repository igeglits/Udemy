package com.example.section02_structure;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        //System.out.println(number);
        System.out.println("Enter number 0-9:");
        var guess = new Scanner(System.in).nextInt();
        if (guess == number) {
            System.out.println("Congratulations, you guessed the number!");
        } else {
            System.out.println("Sorry, but your number is invalid! Try again later...");
        }//второй вариант

        String result;
        if (guess == number) {
            result = "Congratulations, you guessed the number!";
        } else {
            result = "Sorry, but your number is invalid! Try again later...";
        }
        System.out.println(result);
    }
}

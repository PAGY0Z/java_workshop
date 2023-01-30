package com.github.pagy0z.workshop;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        int value_to_guess = (int)(Math.random() * 100);
        int count = 0;
        int valid_input = 0;
        int asked_value = 0;
        while (valid_input != 1) {
            System.out.println("Your guess? ");
            Scanner scann = new Scanner(System.in);
            asked_value = scann.nextInt();
            if (asked_value < value_to_guess) {
                System.out.println("Too Low!");
                count++;
            } else if (asked_value > value_to_guess) {
                System.out.println("Too high!");
                count++;
            } else {
                System.out.println("It took you " + count + " tries.");
                valid_input = 1;
            }
        }
    }
}

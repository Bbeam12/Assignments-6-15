/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bryson.Beam
 */
public class Project8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int x = random.nextInt();
        System.out.println();
        int secretNumber = (int) (Math.random() * 9 + 1);
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("Secret number is " + secretNumber);
        int guess;
        do {
            System.out.print("Enter a guess (0-10): ");
            guess = keyboard.nextInt();
            if (guess == secretNumber) {
                System.out.println("Your guess is correct. Congratulations!");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is smaller than the secret number.");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is greater than the secret number.");
            }
        } while (guess != secretNumber);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bryson.Beam
 */
public class Project7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Whole Number");
        int input = reader.nextInt();
        int num = 7;
        for (int i = 0; i <= num; i++) {
        }

        Random random = new Random();       // Get randome object
        int x = random.nextInt();           // actually generating the number
        System.out.println(x);

    }

}

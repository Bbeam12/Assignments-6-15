/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg6;

import java.util.Scanner;

/**
 *
 * @author Bryson.Beam
 */
public class Project6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Whole Number");
        int num = reader.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= num; i++) {
            System.out.println(i * 2);
        }
    }
}
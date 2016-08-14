/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bekesh.doublearray;

import java.util.Scanner;

/**
 *
 * @author bekesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] subjects = {"java", "sql", "php"};
        String[] students = {"bks", "bikesh", "rajina"};
        int total = 0;
        boolean valid = true;
        double percentage = 0;
        int marks[][] = new int[subjects.length][students.length];

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

            for (int j = 0; j < subjects.length; j++) {
                System.out.println("enter the marks of " + subjects[j]);
                marks[i][j] = input.nextInt();
                
                //validation
                if (!(marks[i][j] <= 100 && marks[i][j] >= 0)) {
                    valid = false;
                       System.out.println("invalid input");
                    
                    marks[i][j] = input.nextInt();
                       System.out.println("invalid input");
                    
                }
                while (!valid) {
                    if (!(marks[i][j] <= 100 && marks[i][j] >= 0)) {
                        valid = false;
                        marks[i][j] = input.nextInt();
                        System.out.println("invalid input");
                    } else {
                        valid = true;
                    }
                }
                total += marks[i][j];
            }
            System.out.println("the total of " + students[i] + " is " + total);
            percentage = (total / subjects.length);
            System.out.println("the percentage is " + percentage + "%");
            total = 0;
        }

    }

}

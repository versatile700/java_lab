package com.lab1;
import java.util.Scanner;

public class q2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            char grade;

            if (marks >= 90) {
                grade = 'O';
            }
            else if (marks >= 80) {
                grade = 'E';
            }
            else if (marks >= 70) {
                grade = 'A';
            }
            else if (marks >= 60) {
                grade = 'B';
            }
            else if (marks >= 50) {
                grade = 'C';
            }
            else {
                grade = 'F';
            }

            System.out.println("Grade: " + grade);

            sc.close();
        }
    }


package com.lab1;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);

        sc.close();

    }

}

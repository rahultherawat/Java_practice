package com.company;

import java.util.Scanner;

public class CWOH_05_takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from user: ");
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number 1:");
//int a = sc.nextInt();  // taking input as int
//        float a = sc.nextFloat();  // taking input as float
//
//        System.out.print("Enter number 2:");
////int b = sc.nextInt();
//        float b = sc.nextFloat();
//        float sum = a + b;
//        System.out.print("the sum of these num is = ");
//        System.out.print(sum);


//        boolean b1 = sc.hasNextInt();  // to check expression validity
//        System.out.print(b1);

        String str = sc.next();           // taking only first word as input
        System.out.println(str);

        String str1 = sc.nextLine(); // taking input as line
        System.out.println(str1);
    }
}

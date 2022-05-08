// Program 3
// Given a number with perfect square n, Generate a matrix with n random numbers between 1-10 in double with maximum precision of 2. Please note, you have to check if the number is perfect square before generating the matrix.
// Sample Input 1:

// 9
// Output 1:

// 8.81 9.64 4.56
// 2.34 2.54 2.22
// 6.90 2.34 4.35





package com.company;

import java.util.Scanner;
import java.util.Random;
public class Program3
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=scanner.nextInt();
        int sqr= (int)Math.sqrt(n);
        System.out.println(sqr);
        if (isPerfectSquare(n)) {
            for( int i=0; i < sqr ; i++) {
                for( int j=0; j < sqr; j++) {
                    double result = (Math.random()) * 10;
                    System.out.print(String.format("%.2f",result));
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
        else
            System.out.print("Given number is not a perfect square");
    }
    static boolean isPerfectSquare(int n)
    {
        if (n >= 0) {
            int sr = (int)Math.sqrt(n);

            return ((sr * sr) == n);
        }
        return false;
    }
}


// Program 2
// Given a n*n matrix, Find the diagonal sum by adding power of n to each value.
// Sample Input:

// 3 3
// 2 6 1
// 1 2 1
// 1 1 1
// Output:

// 27





package com.company;

import java.util.Scanner;

public class Program2 {
    static void printDiagonalSums(int matrix[][], int row,int col)
    {
        int first_diagonal = 0, second_diagonal = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j)
                    first_diagonal += (int) Math.pow(matrix[i][j],row);
                if ((i + j) == (row - 1))
                    second_diagonal += (int) Math.pow(matrix[i][j],row);
            }
        }
        int addition = 0;
        addition=first_diagonal + second_diagonal;
        System.out.println("Diagonal addition is " + addition );
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int row,col;
        System.out.println("Enter the number of rows ");
        row=s.nextInt();
        System.out.println("Enter the  number of columns ");
        col=s.nextInt();
        int matrix [][] = new int[row][col];
        System.out.println("Enter the elements in the matrix ");
        for(int i=0; i< row; i++) {
            for(int j=0; j<col;j++) {
                matrix[i][j]= s.nextInt();
            }
        }
        System.out.println("Elements in the array ");
        for(int i=0; i< row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        printDiagonalSums(matrix,row,col);


    }
}

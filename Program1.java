// Program 1
// Given a list of sentence as string. convert the alphabet characters to opposite case. Example 'a' -> 'A', 'D' -> 'd'.
// Sample Inputs:

// Hi Hello How are you?
// Today is a Programming day 1
// NOT ALL ARE CAPS
// Outputs:

// hI hELLO hOW aRE yOU?
// tODAY iS A pROGRAMMING DAY 1
// not all are caps



package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number of inputs you want to try:");
        int n=scanner.nextInt();
        scanner.nextLine();
        String input="";
        StringBuffer newStr=new StringBuffer(input);
        StringBuffer str= new StringBuffer();
        for(int i=0; i<n; i++) {
            input=scanner.nextLine();
            newStr.append(input);

        }
        System.out.println("Inputs are "+ newStr);
        System.out.println(newStr.length());
        for(int i = 0; i < input.length(); i++) {

            if(Character.isLowerCase(input.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(input.charAt(i)));
            }
            else if(Character.isUpperCase(input.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(input.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + newStr);
    }
}

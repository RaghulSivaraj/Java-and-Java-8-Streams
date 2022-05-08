package com.company;

import java.util.Scanner;
public class Numbers
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=s.nextInt();
        int temp=n;
        int digit=0,last,last_dig,sum=0;
        int even_digits=0,odd_digits=0;
        while(temp > 0) {
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp > 0) {
            last = temp % 10;
            sum+= (Math.pow(last,digit));
            temp=temp/10;
        }
        temp=n;
        if ( n == sum) {
            while (temp > 0) {
                last_dig=temp%10;
                if (last_dig % 2==0) {
                    even_digits+=last_dig;
                }
                temp=temp/10;
            }
            System.out.println(even_digits);
        }
        else {
            while (temp > 0) {
                last_dig=temp % 10;
                if(last_dig % 2 !=0) {
                    odd_digits+=last_dig;
                }
                temp=temp/10;
            }
            System.out.println(odd_digits);
        }
    }
}

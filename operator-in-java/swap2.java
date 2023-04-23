
//Write a program to swap values of two int variables without using a third variable.

import java.util.Scanner;

public class swap2{
    public static void main(String args[]){
        int a;
        int b;
        Scanner src=new Scanner(System.in);
        System.out.println("enter number  a");
        a=src.nextInt();
        System.out.println("enter number  b");
        b=src.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("number of a = "+a +"  number of b = "+b);
        
    }
}
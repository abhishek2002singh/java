
//5. Write a program to input a three-digit number and display the sum of the digits.

import java.util.Scanner;

public class sum{
    
    public static void main(String args[]) {
        int a;
        System.out.println("enter number a");
        Scanner src=new Scanner(System.in);
        a=src.nextInt();
        System.out.println("enter number b");
        int b=src.nextInt();
        System.out.println("enter number c");
        int c=src.nextInt();
        int sum=a+b+c;
        System.out.println("sum of the number is = " + sum);
        
    }
}

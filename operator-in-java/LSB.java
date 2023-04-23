
//7. Write a program to find the position of first 1 in LSB.

import java.util.Scanner;

public class LSB {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int num;
        int sum=0;
        int mul=1;
        int count=0;
        System.out.println("enter number");
        num=src.nextInt();
        while(num>0)
        {
            int rem=num%2;
            mul=(int)Math.pow(10, count);
            sum=sum+rem*mul;
            num/=2;
            count++;
        }

        System.out.println("binary number is = " + sum);
         int rem=0;
        while(sum>0){
             rem=sum%10;
             sum/=10;
        }

        System.out.println("LSB is " + rem);
    }
}

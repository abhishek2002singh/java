import java.util.Scanner;

public class binarytodecimal {
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        int binary=scr.nextInt();
        int sum=0,pow=0,rem=0;
        while(binary>0)
        {
            rem=binary%2;
            sum=sum+(rem*(int)Math.pow(10,pow));
            pow++;
            binary/=2;
        }
        
        System.out.println("decimal number is = " + sum);
    }
}

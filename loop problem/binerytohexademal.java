import java.util.Scanner;
public class binerytohexademal {


    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        int binary=scr.nextInt();
        int sum=0,pow=0;
        while(binary>0)
        {
            int rem=binary%16;
            sum=sum+(rem*(int)Math.pow(10,pow));
            pow++;
            binary/=16;
        }
        System.out.println("decimal number is = " + sum);
    }
}



}

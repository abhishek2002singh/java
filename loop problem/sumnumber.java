import java.util.Scanner;

public class sumnumber {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);  
        int number=src.nextInt();
        int sum=0;
        while(number>0)
        {
             sum+=number;
             number--;
        }  
        System.out.println("sum of number = " + sum);  
    }
}

import java.util.Scanner;

public class sumofoddnumber {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int sum=0;
        for(int i=0;i<number;i++)
        {
            sum=sum+(2*i+1);
        }
        System.out.println("sum of odd number is = " + sum);
    }
}

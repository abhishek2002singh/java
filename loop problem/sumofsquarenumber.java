import java.util.Scanner;

public class sumofsquarenumber {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int sum=0;
        for(int i=0;i<=number;i++)
        {
            sum=sum+i*i;
        }
        System.out.println("sum of square n natural number = " + sum);
    }
}

import java.util.Scanner;

public class reversenumber {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int digit=src.nextInt();
        int sum=0;
        while(digit>0)
        {
            int rem=digit%10;
            sum=sum*10+rem;
            digit/=10;
        }        
        System.out.print("reverse number is = " + sum);
    }
}

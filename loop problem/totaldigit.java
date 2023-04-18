import java.util.Scanner;

public class totaldigit {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int count=0;
        while(number>0)
        {
            number/=10;
            count++;
        }
        System.out.println("total digit is = " + count);
    }
}

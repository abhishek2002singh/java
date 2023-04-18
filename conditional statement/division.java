import java.util.Scanner;

public class division {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        if(number%2==0 && number%3==0)
        {
            System.out.println("divisible by 2 and 3");
        }
        else
        {
            System.out.println("not divisible by 2 and 3");
        }
    }
}

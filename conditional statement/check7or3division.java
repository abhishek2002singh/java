import java.util.Scanner;

public class check7or3division {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        if(number%7==0&&number%3==0)
        {
            System.out.println("number is divisible by 7 and 3");
        }
        else
        {
            System.out.println("number is not divisible by 7 and 3");
        }
    }
}

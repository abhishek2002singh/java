import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial number is = " + fact);
    }
}

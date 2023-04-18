import java.util.Scanner;

public class nextprime {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int i,j;
        for(i=number;i<=number+50;i++)
        {
            for(j=2;j<i;j++)
                if(i%j==0)
                break;
                if(i==j){
                System.out.println("next prime number is = " + i);
                break;
                }

        }
    }
}


import java.util.Scanner;

public class sum {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int arr[]=new int[5];

        System.out.println("enter a number");
        for (int i=0;i<5;i++)
        {
            arr[i]=src.nextInt();
        }
        System.out.println("print array");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]+1);
        }

    }
}

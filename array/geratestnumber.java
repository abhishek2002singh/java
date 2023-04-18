
import java.util.Scanner;

public class geratestnumber {
    public static void main(String args[]) {
        System.out.println("enter size of array");
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=src.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
        }
        System.out.println("maximum number is = " + max);
    }
}

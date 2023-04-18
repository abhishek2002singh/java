import java.util.Scanner;

public class sum1 {
    public static void main(String args[]) {
        System.out.println("enter array element");
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int array[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            array[i]=src.nextInt();
        }
        System.out.println("sum of array");
        for(int i=0;i<size;i++)
        {
             sum=sum+array[i];
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class sumofeven {
    public static void main(String args[]) {
        System.out.println("enter the size of array");
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        System.out.println("enter array element");
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=src.nextInt();
        }
        int sum1=0,sum2=0;
        for(int i=0;i<size;i++)
        {
            if(array[i]%2==0)
            {
                sum1=sum1+array[i];
            }
            else
            {
                sum2=sum2+array[i];
            }
        }
        System.out.println("sum of even number is = " + sum1);
        System.out.println("sum of odd number is = " + sum2);
    }
}

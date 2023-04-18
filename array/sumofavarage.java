import java.util.Scanner;

public class sumofavarage {
    public static void main(String args[]) {
        System.out.println("enter array size");
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=src.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int average=sum/arr.length;
        System.out.println("average of size is = " + average);
    }
}

// 2. Write a program to calculate the average of numbers stored in an array of size 10.
// Take array values from the user.


import java.util.Scanner;

public class average {
    public static void main(String args[]) {
        int num;
        System.out.println("enter arraay sise");
        Scanner src=new Scanner(System.in);
        num=src.nextInt();
        int arr[]=new int[num];
        System.out.println("enter array element");
        for(int i=0;i<num;i++)
        {
            arr[i]=src.nextInt();
        }
        int sum=0;
        for(int i=0;i<num;i++)
        {
            sum=sum+arr[i];
        }
        int avg=(int)sum/num;
        System.out.println("average of array is = " + avg);
        
    }
}

// Write a program to calculate the sum of numbers stored in an array of size 10. Take
// array values from the user.


import java.util.Scanner;

public class inputoutinarray {
    public static void main(String args[]) {
        int num;
        System.out.println("enter array size");
        Scanner src=new Scanner(System.in);
        num=src.nextInt();
        System.out.println("enter array element in array");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=src.nextInt();
        }
        int sum=0;
        for(int i=0;i<num;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of all element in array ia = " + sum);
        
    }
}

import java.util.Scanner;

public class binarysearchusingloop{
    public static void main(String args[]) {
        int num;
        System.out.println("enter size of array");
        Scanner src=new Scanner(System.in);
        num=src.nextInt();
        System.out.println("enter array element");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=src.nextInt();
        }
        System.out.println("enter key for search");
        int key=src.nextInt();
        int st=0;
        int end=arr.length-1;
       
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(arr[mid]==key)
            {
                System.out.println("key is found");
                System.out.println("index of key = "+ mid);
                break;
            }
            else if(arr[mid]<key)
            {
                st=mid;
            }
            else{
                end=mid;
            }
        }
        if (st>end)
        {
            System.out.println("key is not found");
        }
    }
}
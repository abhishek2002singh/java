import java.util.Scanner;

public class linearsearch {
    public static void main(String args[])
    {
        System.out.println("enter array size");
        int num;
        Scanner src=new Scanner(System.in);
        num=src.nextInt();
        int arr[]=new int[num];
        System.out.println("enter array element");
        for(int i=0;i<num;i++)
        {
            arr[i]=src.nextInt();
        }
        int key;
        System.out.println("enter key for search");
        key=src.nextInt();
        int i;
        for( i=0;i<num;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("number is found");
                 break;
            }
           
        }
        if(num==i)
        {
            System.out.println("number is not found");
        }
    }
}

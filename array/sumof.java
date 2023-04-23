import java.util.Scanner;

public class sumof {
    public static void main (String args[]) {
        int num;
        System.out.println("enter array size");
        Scanner src=new Scanner(System.in);
        num=src.nextInt();
        int arr[]=new int[num];
        System.out.println("enter array element");
        for(int i=0;i<num;i++)
        {
            arr[i]=src.nextInt();
        }
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<num;i++)
        {
            if(arr[i]%2==0)
            {
                evensum=evensum+arr[i];
            }
            else{
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println("sum of all even number in array = "+ evensum);
        System.out.println("sum of odd number in array = "+ oddsum);
        
    }
}

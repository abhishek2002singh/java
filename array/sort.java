import java.util.Scanner;

public class sort {
    public static void main(String args[]) {
        System.out.print("enter array size");
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=src.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size-1;j++)
            {
                if(array[i]>array[j])
                {
                    int temp;
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
}

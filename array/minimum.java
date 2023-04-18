import java.util.Scanner;
public class minimum {

    public static void main(String args[]) {
        System.out.println("enter size of array");
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=src.nextInt();
        }
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(minimum>array[i])
            {
                minimum=array[i];
            }
        }
        System.out.println("maximum number is = " + minimum);
    }
}



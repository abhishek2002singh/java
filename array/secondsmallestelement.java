import java.util.Scanner;

public class secondsmallestelement {
    public static void main(String args[]) {
        
        System.out.println("enter size of array");
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=src.nextInt();
        }
        int second;
        int minimum=second=Integer.MAX_VALUE;
        int min=0;
        for(int i=0;i<size;i++)
        {
           
            if(minimum>array[i])
            {
                minimum=array[i];
            }
        }

        for(int i=0;i<size;i++)
        {
            if(array[i]!=minimum){

               if(second>array[i])
             {
                second=array[i];
             } 
            }
           
            
        }

        System.out.println("maximum number is = " + second);
    }
}

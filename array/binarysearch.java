import java.util.*;
public class binarysearch {

    public static int binary(int[] array,int key,int st,int end)
    {
    
    if(st>end)
        return -1;    
    int mid=(st+end)/2;
        if(array[mid]==key)
        {

            return mid;
        }
        if(array[mid]<key)
        {
            st=mid+1;
        
           return binary( array,key,st,end);
        }
        else{
            end=mid-1;
           return binary(array,key,st,end);
        }
    
        
    
    }

        
        
        
    
   
    public static void main(String args[]) {
        
         System.out.println("enter size of array");
         Scanner src=new Scanner(System.in);
         int size=src.nextInt();
         int array[]=new int[size];
         int n=size;
         
         for(int i=0;i<size;i++)
         {
             array[i]=src.nextInt();
         }
        int key=5;
       int sum= binary(array,key,0,n-1);
       System.out.println(sum);
    }
}

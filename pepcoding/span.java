import java.util.Scanner;

public class span {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=src.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("maximum number is="+ max);

       int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("minimum number is=" +min);

        int diff=max-min;
        System.out.println("span number is ="+ diff);
        
    }
}

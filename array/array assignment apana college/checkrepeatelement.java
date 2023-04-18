import java.util.*;

public class checkrepeatelement {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=src.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
              if(arr[i-1]==arr[i])
              {
                System.out.println("repeate element is present");
                return;
              }
        }
        System.out.println("repeate element is not present");
    }
}

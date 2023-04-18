import java.util.*;
public class nextgreaternumber {
    public static void main(String args[]) {
           int arr[]={6,8,0,1,3};
           int arr1[]=new int[arr.length];
           Stack<Integer>st=new Stack<>();
           for(int i=arr.length-1;i>=0;i--)
           {
              while(!st.isEmpty()&&arr[i]>=arr[st.peek()])
              {
                st.pop();
              }
               if(st.isEmpty())
               {
                arr1[i]=-1;
               }
               else{
                arr1[i]=arr[st.peek()];
               }
               st.push(i);
           }        
           for(int i=0;i<arr1.length;i++)
           {
            System.out.print(arr1[i] +" ");
           }
    }
}

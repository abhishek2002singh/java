import java.util.*;

public class union {

    public static void union2(int[] arr1,int[] arr2) {

        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            st.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++)
        {
            st.add(arr2[i]);
        }

        System.out.println("size is = " + st.size());
        

    }
        
    public static void main(String args[]) {
          Scanner src=new Scanner(System.in);
          int size= src.nextInt();    
          int arr1[]=new int[size];
          System.out.println("enter array elelment");
          for(int i=0;i<arr1.length;i++)
          {
            arr1[i]= src.nextInt();
          }
          int size2=src.nextInt();
          int arr2[]=new int[size2];
          System.out.println("enter array elelment");
          for(int i=0;i<arr2.length;i++)
          {
            arr2[i]= src.nextInt();
          }
          union2(arr1,arr2);    
    }
}

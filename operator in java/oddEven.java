import java.util.*;

public class oddEven {
    
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter number for check odd or even");
        int num=src.nextInt();
        if((num^1)==(num+1)){
             System.out.println("number is even");
        }
        else{
            System.out.println("number is odd ");
        }

    }
}


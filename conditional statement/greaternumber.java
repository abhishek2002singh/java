
import java.util.*;
public class greaternumber {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter a number");
        int a=src.nextInt();
        int b=src.nextInt();
        if(a>b)
        {
            System.out.println("greater number is = " + a);
        }
        else if(a==b)
        {
            System.out.println("equal number");
        }
        else if(a<b)
        {
            System.out.println("gratter number is = " + b);
        }
        
    }
}

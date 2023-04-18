import java.util.*;

public class root {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the value a,b,c");
        int a=src.nextInt();
        int b=src.nextInt();
        int c=src.nextInt();
        int d;
        d=b*b-4*a*c;
        if(d>0)
        {
            System.out.println("root is real and distinct");
        }
        else if(d==0)
        {
            System.out.println("root is equal and distinct");

        }
        else{
            System.out.println("root is imaginary");
        }
    }
}

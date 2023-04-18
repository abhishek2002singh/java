import java.util.*;

public class greater {
    public static void main(String args[]) {
    Scanner src=new Scanner(System.in);
    int a=src.nextInt();
    int b=src.nextInt();        
    int c=src.nextInt();
    if(a>b && b>c)
    {
        System.out.println("greater number is : " + a);
    }
    else if(b>c)
    {
        System.out.println("greater number is=" + b);
    }
    else{
        System.out.println("greater number is = " + c);
    }
    }
}

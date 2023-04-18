 import java.util.*;
 public class withoutmodulus {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int m,s;
        m=number/2;
        s=number-m*2;
        if(s==0||s==2||s==4||s==6||s==8)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd nnumber");
        }
    }
}

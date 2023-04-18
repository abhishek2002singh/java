import java.util.*;
public class digit {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int digit=src.nextInt();
        int rem=0,count=0;
        while(digit>0)
        {
            digit=digit/10;
            count++;
        }
        System.out.println("total digit is=" + count);
    }
}

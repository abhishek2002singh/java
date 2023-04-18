import java.util.*;

public class checkleapyear {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter year");
        int year=src.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
          }
    }
}

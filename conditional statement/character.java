import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class character {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        char ch=src.next().charAt(0);
        if(ch>=65&&ch<=90)
        {
            System.out.println("upper case");
        }
        else if(ch>=97&&ch<=122)
        {
            System.out.println("lower case");
        }
        else
        {
            System.out.println("special case");
        }
    }
}

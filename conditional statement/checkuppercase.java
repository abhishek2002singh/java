import java.util.Scanner;

public class checkuppercase {
    public static void main(String args[]) {
    Scanner src=new Scanner(System.in);  
       char ch=src.next().charAt(0) ;
       if(ch>=65&&ch<=90)
       {
        System.out.println("upper case");
       } 
       else
       {
        System.out.println("lower case");
       }    
    }
}

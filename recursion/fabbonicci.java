import java.util.*;

public class fabbonicci {

    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.print("Enter a string: ");  
        String str= src.nextLine();              //reads string   
        int count=0;
        int sum=0;
        int l=str.length();
        String newString = new String();
        char dira=str.charAt(l-1);
        char dirw=str.charAt(0);
        if(dira=='%'||dira=='*'||dira=='/'||dira=='-'||dira=='+')
        {
            System.out.println("enter valid expression");
        }
        else if(dirw=='%'||dirw=='*'||dirw=='/')
        {
            System.out.println("enter valid expression");
        }
        else{

        for(int i=0;i<str.length();i++)
        {
            sum=0;
            char dir=str.charAt(i);
            if(dir=='%')
            {
               sum=str.charAt(i-1)%str.charAt(i+1);
            }
           
        }
        for(int i=0;i<str.length();i++)
        {
            sum=0;
            char dir=str.charAt(i);
            if(dir=='*')
            {
               sum=str.charAt(i-1)*str.charAt(i+1);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            sum=0;
            char dir=str.charAt(i);
            if(dir=='+')
            {
               sum=str.charAt(i-1)+str.charAt(i+1);
               
            }
            
        }
        for(int i=0;i<str.length();i++)
        {
            sum=0;
            char dir=str.charAt(i);
            if(dir=='-')
            {
               sum=str.charAt(i-1)-str.charAt(i+1);
            }
        }
        System.out.println(str);
    }
    }
}
import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        int i=0;  
        Scanner src=new Scanner(System.in);
          int a=src.nextInt();
          for( i=2;i<a;i++)
          {
              if(a%i==0)
              {
                System.out.println("not prime number");
                break;
              }
          }        
          if(i==a){
            System.out.println("prime number");
          }
    }
}

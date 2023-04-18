import java.util.Scanner;
import static java.lang.Math.*;

public class checkfabonacci {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int m=(int)sqrt((5*number*number)-4); 
        int n=(int)sqrt((5*number*number)+4) ; 
        if(m*m==(5*number*number-4)||n*n==(5*number*number+4))
        {
            System.out.println("fabonacci series");
        }
        else
        {
            System.out.println("not fabonacci series");
        } 
    }
}

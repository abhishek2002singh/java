import java.util.*;

public class printincreasingordernaturalnumber {

    public static void print(int n) {
        if (n == 1) {
           System.out.println(1 +" ");
           return;
        }
        print(n-1);
        System.out.println(n);
        
    }

    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        print(n);

    }
}



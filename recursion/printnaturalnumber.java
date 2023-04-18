

import java.util.Scanner;

public class printnaturalnumber {
    public static void print(int n) {
        if (n == 1) {
           System.out.println(1 +" ");
           return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        print(n);

    }
}

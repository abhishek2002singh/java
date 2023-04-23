import java.util.Scanner;


//Write a program to swap values of two int variables


public class swap {
    public static void main(String args[]) {
        int a;
        int b;
        System.out.println("enter the value a ");
        System.out.println("enter the value b");
        Scanner src=new Scanner(System.in);
        a=src.nextInt();
        b=src.nextInt();
        int num=a;
        a=b;
        b=num;
        System.out.println("number is a = " +a +"  number is b = "+b);
    }
}

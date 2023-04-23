import java.util.Scanner;

public class unitDigit {
    public static void main(String args[]){
        int num;
        System.out.println("enter a number ");
        Scanner src=new Scanner(System.in);
        num=src.nextInt();
        int rem;
        rem=num%10;
        System.out.println("unit digit is = "+ rem);
    }
}

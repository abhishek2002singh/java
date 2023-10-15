import java.util.Scanner;

public class AddLastDigitIsNine {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number");
        Scanner src=new Scanner(System.in);
        num=src.nextInt();
        num=num/10;
        num*=10;
        num=num+9;
        System.out.println("number is ="+num);
        
    }
}

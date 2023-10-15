import java.util.Scanner;

public class addLastDigitIsZero {
    public static void main(String args[]){
        int num;
        System.out.println("enter digit");
        Scanner src=new Scanner(System.in);
        num=src.nextInt();
        num=num/10;
        num=num*10;
        System.out.println("number is ="+num);
    }
}

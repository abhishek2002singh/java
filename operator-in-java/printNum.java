import java.util.Scanner;

//  Write a program to print a given number without its last digit. 


public class printNum {
  public static void main(String args[]) {
   int num;
   System.out.println("enter a number");
   Scanner src=new Scanner(System.in); 
   num=src.nextInt();
   int rem=num/10;
   System.out.println("number without last digit = "+ rem);
  }  
}

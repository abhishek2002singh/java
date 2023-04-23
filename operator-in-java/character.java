//6. Write a program which takes a character as an input and displays its ASCII code.

import java.util.Scanner;

public class character {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        System.out.println("enter name of boys");
        String name=src.next();
        char name1=name.charAt(0);
        int num=(int)name1;
        System.out.println("ascii code of first character is " + num);
    }
}

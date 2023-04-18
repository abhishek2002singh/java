import java.util.Scanner;

import java.util.*;
public class checkpassfail {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int hindi=src.nextInt();
        int english=src.nextInt();
        int physics=src.nextInt();
        int chemistry=src.nextInt();
        int math=src.nextInt();
        if(hindi>=33&& english>=33 && physics>=33 && chemistry>=33 && math>=33)
        {
            System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }
    }
}

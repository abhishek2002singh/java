import java.util.Scanner;

public class USD {
    public static void main(String args[]) {
       float usd=76.9f;
       Scanner src=new Scanner(System.in);
       float rup;
       rup=src.nextFloat();
       float us=rup/usd;
       System.out.println("USD is ="+us);
        
    }
}

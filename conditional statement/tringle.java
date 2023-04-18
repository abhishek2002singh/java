import java.util.Scanner;

public class tringle {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        float a=src.nextFloat();
        float b=src.nextFloat();
        float c=src.nextFloat();
        if(b<(a+c)&&(a+b)>c&&(b+c)>a)
        {
            System.out.println("tringle is valid");
        }
        else
        {
            System.out.println("tringle is not valid");
        }
    }
}

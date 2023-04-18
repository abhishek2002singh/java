import java.util.*;
public class profit {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        float cost=src.nextFloat();
        float selling=src.nextFloat();
        float pro,per;
        pro=selling-cost;
        if(pro>0)
        {
            System.out.println("profit");
             per=(pro*100)/cost;
             System.out.println("profit percentage is=" + per);
        }
        else
        {
            System.out.println("loss");
            per=(pro*100)/cost;
            System.out.println("loss percentage is=" + per);
        }
    }
}

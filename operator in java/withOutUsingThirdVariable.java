

public class withOutUsingThirdVariable {
    public static void main(String args[]){
        int a=40;
        int b=20;
       a=a+b;
      b=a-b;
      a=a-b;

        System.out.println("swap number without using third variable "+"\n"+"a = "+a +"\n"+"b = "+b);
    }
}

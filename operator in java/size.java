import java.util.*;

public class size {
    public static void main(String args[]) {
         int intValue = 42;
        float floatValue = 3.14f;
        char charValue = 'A';
        double doubleValue = 2.71828;

        System.out.println("Size of int: " + Integer.SIZE / 8 + " bytes");
        System.out.println("Size of float: " + Float.SIZE / 8 + " bytes");
        System.out.println("Size of char: " + Character.SIZE / 8 + " bytes");
        System.out.println("Size of double: " + Double.SIZE / 8 + " bytes");
   
}
}
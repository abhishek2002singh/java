import java.util.Scanner;

public class secondlargest {
    public static void main(String args[]) {
        int num;
        System.out.println("enter array size");
        Scanner src = new Scanner(System.in);
        num = src.nextInt();
        int arr[] = new int[num];
        System.out.println("enter array element");
        for (int i = 0; i < num; i++) {
            arr[i] = src.nextInt();
        }
        int max1;
        int max = max1 = minimum.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] != max) {
                if (max1 < arr[i]) {
                    max1 = arr[i];
                }
            }

        }

        System.out.println("second largest element in array = "+ max1);

    }
}


import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        int[] a1 = { 1, 3, 4, 2, 5, 6, 7, 8 };
        // int[] a2 = a1.clone();
        int[] a3 = a1;
        a3[0] = 100;
        System.out.println(a1.length);
        System.out.println(a1[0]);
        int[] a4 = Arrays.copyOfRange(a1, 1, 3);
        for (int i = 0; i < a4.length; i++) {
            System.out.println(a4[i]);
        }

    }
}

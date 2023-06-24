
//import java.util.Scanner;

public class Orde {
    public static void main(String[] args) {
        class Oper<T> {

          private  T add(T n1, T n2) {

                return n1 + n2;
            }
        }

        Oper<float> o2 = new Oper<float>();
        System.out.println(o2.add(1.6, 2.7));

    }
}

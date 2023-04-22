import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Calc calc1 = new Calc();
        System.out.println(calc1.sum(new ArrayList<>(Arrays.asList(1.5, 2.1, 3.0))));
        System.out.println(calc1.subtracnion(new ArrayList<>(Arrays.asList(2.0, 1.1, 9.0))));
        System.out.println(calc1.multy(new ArrayList<>(Arrays.asList(1.0, 5.8, 3.5))));
        System.out.println(calc1.div(new ArrayList<>(Arrays.asList(6.2, 8.1, 3.3))));

        System.out.println();
        System.out.println(calc1.binaryToDouble(1111));
        System.out.println(calc1.binaryToDouble("1111"));

        System.out.println();
        System.out.println(calc1.toBinary(9.7));
        System.out.println(calc1.toBinary("7.2"));


    }
}
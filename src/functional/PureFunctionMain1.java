package functional;

import java.util.function.Function;

public class PureFunctionMain1 {

    public static void main(String[] args) {

        Function<Integer, Integer> func = x -> x * 2;

        Integer result1 = func.apply(10);
        System.out.println("result1 = " + result1);

        Integer result2 = func.apply(10);
        System.out.println("result2 = " + result2);

    }

}

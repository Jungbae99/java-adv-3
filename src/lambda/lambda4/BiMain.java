package lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("sum: " + add.apply(1, 2));

        BiConsumer<String, Integer> repeat = (c, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(c);
            }
        };
        repeat.accept("*", 5);

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println("isGreater: " + isGreater.test(1, 2));

    }
}

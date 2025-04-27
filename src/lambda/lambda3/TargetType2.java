package lambda.lambda3;

import java.util.function.Function;

// 자바가 기본으로 제공하는 Function 사용
public class TargetType2 {
    public static void main(String[] args) {
        Function<String, String> uppercase = s -> s.toUpperCase();
        System.out.println("result1 = " + uppercase.apply("hello"));

        Function<Integer, Integer> square = i -> i * i;
        System.out.println("result2 = " + square.apply(5));
    }
}

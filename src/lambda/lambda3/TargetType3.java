package lambda.lambda3;

import java.util.function.Function;

// 자바가 기본으로 제공하는 Function 대입
public class TargetType3 {
    public static void main(String[] args) {
        // 람다 직접 대입 : 문제없음
        Function<Integer, String> functionA = i -> "value = " + i;
        System.out.println(functionA.apply(10));

        Function<Integer, String> functionB = functionA;
        System.out.println(functionB.apply(20));
    }
    
}

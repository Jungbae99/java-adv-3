package functional;

import java.util.function.Function;

public class CompositionMain1 {
    public static void main(String[] args) {
        // 1. x를 입력받아 x * x 하는 함수
        Function<Integer, Integer> square = x -> x * x;

        // 2. x를 입력받아 x + 1 하는 함수
        Function<Integer, Integer> add = x -> x + 1;

        // 함수 합성
        // 1. compose()를 사용한 새로운 함수 사용
        // square(add(2)) -> square(3) -> 9
        Function<Integer, Integer> newFunc1 = square.compose(add);
        System.out.println("newFunc1.apply(2) = " + newFunc1.apply(2));

        // 2. andThen() 을 사용한 새로운 함수 생성
        // add(square(2)) -> add(4) -> 5
        Function<Integer, Integer> newFunc2 = square.andThen(add);
        System.out.println("newFunc2.apply(2) = " + newFunc2.apply(2));

    }
}

package functional;

import java.util.function.Function;

public class SideEffectMain2 {

    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> x * 2;
        Integer result = func.apply(10);

        // 부수효과는 순수 함수와 분리해서 실행
        // 출력은 별도로 처리해서 순수성을 유지
        System.out.println("result = " + result);
    }
}

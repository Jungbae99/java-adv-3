package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {
    public static void main(String[] args) {
        // 기본형 매개변수, IntFunction, LongFunction, DoubleFunction
        IntFunction<String> function = (x) -> "숫자: " + x;
        System.out.println(function.apply(100));

        // 기본형 반환, toIntFunction, toLongFunction, toDoubleFunction
        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println("toIntFunction.applyAsInt(\"hello\") = " + toIntFunction.applyAsInt("hello"));

        // 기본형 매개변수의 기본형 반환
        IntToLongFunction toLongFunction = x -> x * 100;
        System.out.println("toLongFunction.applyAsLong(100) = " + toLongFunction.applyAsLong(100));

        // IntUnaryOperator : int -> int
        IntUnaryOperator intUnaryOperator = x -> x * 100;
        System.out.println("intUnaryOperator.applyAsInt(100) = " + intUnaryOperator.applyAsInt(100));

        // 기타, IntConsumer, IntSupplier, IntPredicate ...
    }
}

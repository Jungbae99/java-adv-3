package lambda.lambda3;

public class TargetType1 {
    public static void main(String[] args) {
        // 람다 직접 대입 : 문제없음
        FunctionA functionA = i -> "value = " + i;
        FunctionB functionB = i -> "value = " + i;

        // 이미 만들어진 FunctionA 인스턴스를 FunctionB에 대입:
//        FunctionB targetB = functionA; // 컴파일 에러 발생...

    }

    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }
}

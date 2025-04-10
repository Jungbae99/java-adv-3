package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple1 {
    public static void main(String[] args) {
        MyFunction function1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("function1: " + function1.apply(1, 2));

        // 단일 표현식인 경우 중괄도와 리턴 생략 가능
        MyFunction function2 = (int a, int b) -> a + b;
        System.out.println("function2: " + function2.apply(1, 2));

        // 단일 표현식이 아닌 경우에는 중괄호와 return 필수
        MyFunction function3 = (int a, int b) -> {
            System.out.println("람다 실행");
            return a + b;
        };
        System.out.println("function3: " + function3.apply(1, 2));

        // 메서드 레퍼런스(참조) 형식으로 줄이기
        MyFunction function4 = Integer::sum;
        System.out.println("function4 = " + function4.apply(1, 2));
    }
}

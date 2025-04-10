package lambda.lambda1;

import lambda.Procedure;

public class LambdaSimple2 {
    public static void main(String[] args) {
        Procedure procedure1 = () -> {
            System.out.println("Hello! Lambda");
        };
        procedure1.run();

        // 단일표현식은 중괄호 생략
        Procedure procedure2 = () -> System.out.println("Hello! Lambda");
        procedure1.run();
    }
}

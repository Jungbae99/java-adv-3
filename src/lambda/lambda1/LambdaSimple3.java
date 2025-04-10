package lambda.lambda1;

import lambda.MyFunction;
import lambda.Procedure;

public class LambdaSimple3 {
    public static void main(String[] args) {
        MyFunction function1 = (int a, int b) -> {
            return a + b;
        };

        MyFunction function2 = (a, b) -> a + b;
    }
}

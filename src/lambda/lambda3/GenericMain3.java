package lambda.lambda3;

public class GenericMain3 {

    public static void main(String[] args) {
        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return ((String) s).toUpperCase();
            }
        };

        String result1 = (String) upperCase.apply("Hello");
        System.out.println("result1 = " + result1);

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object n) {
                return (Integer) n * (Integer) n;
            }
        };
        Integer result2 = (Integer) square.apply(3);
        System.out.println("result2 = " + result2);

    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object o);
    }
}

package lambda.lambda4;

public class RunnableMain {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("hello runnable");
        r.run();
    }

}

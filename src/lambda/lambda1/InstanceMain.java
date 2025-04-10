package lambda.lambda1;

import lambda.Procedure;

public class InstanceMain {
    public static void main(String[] args) {

        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("Hello! lambda");
            }
        };
        System.out.println("procedure.getClass() = " + procedure1.getClass());
        System.out.println("procedure.instance() = " + procedure1);

        Procedure procedure2 = () -> {
            System.out.println("Hello! lambda");
        };

        System.out.println("procedure.getClass() = " + procedure2.getClass());
        System.out.println("procedure.instance() = " + procedure2);
    }
}

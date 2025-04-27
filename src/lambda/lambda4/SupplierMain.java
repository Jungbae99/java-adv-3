package lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier supplier1 = new Supplier() {
            @Override
            public Object get() {
                return new Random().nextInt(10);
            }
        };

        System.out.println("supplier1.get() = " + supplier1.get());

        Supplier supplier2 = () -> new Random().nextInt(10);
        System.out.println("supplier2.get() = " + supplier2.get());
    }

}

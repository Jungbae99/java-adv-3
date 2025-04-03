package lambda.start;

import lambda.Procedure;

import java.util.Random;

// 익명클래스 사용, 변수 제거, 익명클래스의 참조값을 매개변수(파라미터)에 직접 전달
public class Ex1RefMainV4 {

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }


    public static void main(String[] args) {
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        hello(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
            }
        });
    }

}
